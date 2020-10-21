package com.leetcodde.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * 47. 全排列 II
 *
 * @author admin
 *
 */
public class PermuteUnique {
	private List<List<Integer>> ans = new ArrayList<List<Integer>>();
	private List<Integer> temp = new ArrayList<Integer>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		boolean[] visited = new boolean[nums.length];
		permuteUniqueDFS(nums, visited);
		return ans;
	}

	public void permuteUniqueDFS(int[] nums, boolean[] visited) {
		if (temp.size() == nums.length) {
			ans.add(new ArrayList<Integer>(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (visited[i]||(i>0&&nums[i]==nums[i-1]&&!visited[i-1])) {
				continue;
			}
			visited[i] = true;
			temp.add(nums[i]);
			permuteUniqueDFS(nums, visited);
			temp.remove(temp.size() - 1);
			visited[i] = false;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		PermuteUnique test = new PermuteUnique();
		System.out.println(test.permuteUnique(nums));

	}
}
