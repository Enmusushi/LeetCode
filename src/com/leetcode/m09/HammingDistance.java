package com.leetcode.m09;
/**
 * 461. 汉明距离
 */
public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int res = x ^y;
		int count =0;
		while(res!=0) {
			count += res&1;
			res>>>=1;
		}
		return count;
	}
	public static void main(String[] args) {
		
//		System.out.println(test.hammingDistance(1, 4));

	}
}
