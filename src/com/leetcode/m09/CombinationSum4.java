package com.leetcode.m09;

import java.util.*;

public class CombinationSum4 {
	private List<List<Integer>> ans = new LinkedList<>();
	private List<Integer> temp = new ArrayList<>();
	private List<Set<Integer>> result = new LinkedList<>();
	private Set<Integer> tempSet = new HashSet<>();
	public int combinationSum4(int[] nums, int target) {
		combinationSum4DFS(nums, target, 0);
		return ans.size();
	}
	public void combinationSum4DFS(int[] nums, int target, int index) {
		if (target == 0) {
			ans.add(new ArrayList<>(temp));
			tempSet.addAll(temp);
			result.add(new HashSet<>(tempSet));
			tempSet.clear();
			return;
		} else if (target < 0 || index == nums.length) {
			return;
		}
		if (target >= nums[index]) {
			if (target % nums[index] == 0) {
				temp.add(nums[index]);
				combinationSum4DFS(nums, target - nums[index], index);
				temp.remove(temp.size() - 1);
			} else {
				temp.add(nums[index]);
				combinationSum4DFS(nums, target - nums[index], index + 1);
				temp.remove(temp.size() - 1);
			}
		}
		combinationSum4DFS(nums, target, index + 1);
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1 };
		CombinationSum4 test = new CombinationSum4();
		System.out.println(test.combinationSum4(nums, 4));
		System.out.println(test.ans);
		System.out.println(test.result);
	}
}
