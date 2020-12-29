package com.leetcode.hard;

public class MinPatches {
	public int minPatches(int[] nums, int n) {
		int patches = 0;
		int index = 0;
		int length = nums.length;
		long x = 1;
		while (x <= n) {
			if (index < length && nums[index] <= x) {
				x += nums[index];
				index++;
			} else {
				//System.out.println(x);
				x <<= 1;
				patches++;
			}
		}
		return patches;
	}

	public static void main(String[] args) {
		int[] nums = { 10 };
		MinPatches test = new MinPatches();
		System.out.println(test.minPatches(nums, 20));
	}
}
