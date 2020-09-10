package com.leetcode.m09;
/**
 * 53. 最大子序和
 * @author admin
 *
 */
public class MaxSubArray {
	public int maxSubArray(int[] nums) {
    	int maxSum = Integer.MIN_VALUE;
    	int thisSum = 0;
    	for(int i:nums) {
    		thisSum +=i;
    		maxSum =thisSum>maxSum?thisSum:maxSum;
    		thisSum = thisSum < 0? 0 :thisSum;
    	}
		return maxSum;
    }
}
