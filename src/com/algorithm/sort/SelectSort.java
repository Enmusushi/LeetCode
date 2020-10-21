package com.algorithm.sort;

import java.util.Arrays;

public class SelectSort {
	public void selectSort(int[] nums) {
		int k=0;
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			k = i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[k]>nums[j]) {
					k= j ;
				}
			}
			temp = nums[i];
			nums[i]=nums[k];
			nums[k]=temp;
		}
	}
	public static void main(String[] args) {
		int[] nums = {9,7,8,6,5,4,3,2,1};
		SelectSort  test = new SelectSort();
		test.selectSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
