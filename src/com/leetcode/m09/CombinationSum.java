package com.leetcode.m09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 39. 组合总和（每日一题）
 */
public class CombinationSum {
	 private List<List<Integer>> ans = new LinkedList<List<Integer>>();
	 private List<Integer> temp = new ArrayList<Integer>();
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 combinationSumDFS2(candidates,target,0);
		 return ans;
	 }
	 //5ms
	 public void combinationSumDFS(int[] candidates, int target,int sum,int cur) {
		 if(sum==target) {
			 ans.add(new ArrayList<Integer>(temp));
		 }else if(sum>target||cur>=candidates.length) {
			 return ;
		 }else {
			 temp.add(candidates[cur]);
			 sum+=candidates[cur];
			 combinationSumDFS(candidates,target,sum,cur);
			 sum-=candidates[cur];
			 temp.remove(temp.size()-1);
			 combinationSumDFS(candidates,target,sum,cur+1);
		 }
	 }
	 //2ms
	 public void combinationSumDFS2(int[] candidates, int target,int cur) {
		 if(target == 0) {
			 ans.add(new ArrayList<Integer>(temp));
		 }
		 for(int i=cur;i<candidates.length;i++) {
			 if(target<candidates[i]) {
				 continue;
			 }
			 temp.add(candidates[i]);
			 combinationSumDFS2(candidates,target-candidates[i],i);
			 temp.remove(temp.size()-1);
		 }
	 }
	 public static void main(String[] args) {
		 int[] candidates = {2,3,5};
		 CombinationSum combinationSum = new CombinationSum();
		 System.out.println(combinationSum.combinationSum(candidates, 8));
	}
}
