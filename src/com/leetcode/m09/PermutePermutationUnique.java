package com.leetcode.m09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 47. 全排列 II
 */
public class PermutePermutationUnique {
	private List<List<Integer>> ans = new LinkedList<List<Integer>>();
	private List<Integer> temp = new LinkedList<Integer>();
   
    public List<List<Integer>> permuteUnique2(int[] nums) {
        Arrays.sort(nums);
        permuteUnique2DFS(nums,0);
        return ans;
    }
    public void permuteUnique2DFS(int[] nums,int index) {
    	if(temp.size() == nums.length) {
    		ans.add(new ArrayList<Integer>(temp));
    		return;
    	}else if(temp.size() >nums.length) {
    		return;
    	}
    	for(int i=index;i<nums.length;i++)
    	{
    		if(i>index&&nums[i]==nums[i-1]) {
    			continue;
    		}
        	temp.add(nums[i]);
        	permuteUnique2DFS(nums,i+1);
        	temp.remove(temp.size()-1);
    	}
    	
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,1,2};
    	PermutePermutationUnique test = new PermutePermutationUnique();
    	System.out.println(test.permuteUnique2(nums));
	}
    
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueDFS(nums, res, new LinkedList<Integer>(), visited);
        return res;
    }

    public void permuteUniqueDFS(int[] nums, List<List<Integer>> res, List<Integer> oneRes, boolean[] visited) {
        if (oneRes.size() == nums.length) {
            res.add(new LinkedList<Integer>(oneRes));
        }
        int lastUsed = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || nums[i] == lastUsed) {
                continue;
            }
            visited[i] = true;
            oneRes.add(nums[i]);
            permuteUniqueDFS(nums, res, oneRes, visited);
            lastUsed = nums[i];
            visited[i] = false;
            oneRes.remove(oneRes.size() - 1);
        }
    }
}
