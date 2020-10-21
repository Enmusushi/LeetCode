package com.algorithm.sort;

import java.util.Arrays;

public class ShellSort {
	//插入排序升级版,先抄一遍
	public void shellSort(int[] nums) {
		int k= 1;
		while(k<nums.length) {
			k = k<<1+1;
		}
		while(k>0) {
			for(int i = k;i<nums.length;i++) {
				int temp = nums[i];
				int j= i-k;//前面一个值的游标
				while(j>=0&&nums[j]>temp) {
					nums[j+k] = nums[j];
					j-=k;
				}
				//最终的位置：循环结束的时候，2种可能
				//1、j<0;
				//2、前面的值比要插入的值要小
				nums[j+k]=temp;//省了判断
			}
			k/=2;
		}
	}
	public static void main(String[] args) {
		int[] nums = {9,7,8,6,5,4,3,2,1};
		ShellSort  test = new ShellSort();
		test.shellSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
}
