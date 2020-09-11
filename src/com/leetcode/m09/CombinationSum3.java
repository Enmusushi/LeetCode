package com.leetcode.m09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    private List<List<Integer>> ans = new LinkedList<>();
    private List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        //boolean[] visited = new boolean[10];
        int[] nums = {1,2,3,4,5,6,7,8,9};
        combinationSum3DFS(k,n,0,nums);
        return ans;
    }
    public void combinationSum3DFS(int k,int n,int index,int[] nums){
        if(temp.size() == k&&n==0){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        if(index==nums.length){
            return;
        }
        if(n>=nums[index]){
            temp.add(nums[index]);
            combinationSum3DFS(k,n-nums[index],index+1,nums);
            temp.remove(temp.size()-1);
        }else{
            return;
        }
        combinationSum3DFS(k,n,index+1,nums);
    }

    public static void main(String[] args) {
        CombinationSum3 test = new CombinationSum3();
        System.out.println(test.combinationSum3(3, 7));
    }

}
