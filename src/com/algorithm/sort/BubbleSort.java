package com.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
	public void bubbleSort(int[] nums) {
		int temp=0;
		for(int i=0;i<nums.length-1;i++) //决定冒泡次数
		{
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j]  = nums[j+1];
					nums[j+1]  =temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {9,7,8,6,5,4,3,2,1};
		BubbleSort  test = new BubbleSort();
		test.bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
}
