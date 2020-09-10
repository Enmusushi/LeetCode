package com.leetcode.m09;
/**
 * 35. 搜索插入位置
 * @author admin
 *
 */
public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
    	int  i= 0;
    	while(i<nums.length) {
    		if(target>nums[i]) {
    			i++;
    		}else {
    			break;
    		}
    	}
		return i;
    }
}
