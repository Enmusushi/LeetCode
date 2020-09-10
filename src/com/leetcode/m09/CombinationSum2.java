package com.leetcode.m09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/**
 * 40. 组合总和 II(每日一题）2020-09-10 
 */
//执行时间：3ms
public class CombinationSum2 {
    private List<List<Integer>> ans = new LinkedList<List<Integer>>();
    Stack<Integer> temp = new Stack<Integer>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum2DFS(candidates, target, 0);
        return ans;
    }
    public void combinationSum2DFS(int[] candidates, int target, int index) {
        if (target == 0) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        } else if (target < 0 || index >= candidates.length) {
            return;
        }
        int count = 1;
        for(int i=index;i<candidates.length-1;i++) {
        	if(candidates[i] == candidates[i +1]) {
        		count++;
        	}else {
        		break;
        	}
        }
        combinationSum2DFS(candidates, target, index + count);
        if(target<candidates[index]) {
        	return;
        }else if (target >= candidates[index]) {
            temp.push(candidates[index]);
            combinationSum2DFS(candidates, target - candidates[index], index + 1);
            temp.pop();
        }

    }
    public static void main(String[] args) {
//        int[] candidates = {10, 1, 2, 7, 6, 1,1, 5};
//        int[] candidates2 = {2,5,2,1,2};
//        int[] candidates3 = {2,2,2};
        int[] candidates4 = {3,1,3,5,1,1};
        
        CombinationSum2 combinationSum2 = new CombinationSum2();
    //    System.out.println(combinationSum2.combinationSum2(candidates, 8));
        
        System.out.println(combinationSum2.combinationSum2(candidates4, 8));

    }
}
