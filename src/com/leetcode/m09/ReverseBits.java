package com.leetcode.m09;

/**
 * 190. 颠倒二进制位
 */
public class ReverseBits {
	//可以优化：记录以前所移动的位置，不用每次都从最低位开始移动
    public int reverseBits(int n) {
    	int result=0;
    	for(int i=0;i<32;i++) {
    		result=(result<<1)+(n&1);
    		n>>>=1;
    	}
        return result;
    }
    public static void main(String[] args) {
		ReverseBits test = new ReverseBits();
		System.out.println(test.reverseBits(-1));
		System.out.println(test.reverseBits(1));
		System.out.println(test.reverseBits(0));
	}
}
