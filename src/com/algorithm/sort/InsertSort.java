package com.algorithm.sort;

import java.util.Arrays;

public class InsertSort {

	public void insertSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
				int temp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 9, 7, 8, 6, 5, 4, 3, 2, 1 };
		InsertSort test = new InsertSort();
		test.insertSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
