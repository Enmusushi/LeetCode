package com.leetcode.simple;
/**
 * 69. x 的平方根
 */
public class MySqrt {
    public int mySqrt(int x) {
    	int i =1;
    	while((long)i*i<=x) {
    		i++;
    	}
		return i-1;
    }
    public static void main(String[] args) {
    	MySqrt test = new MySqrt();
		System.out.println(test.mySqrt(8));
		System.out.println(test.mySqrt(64));
		System.out.println(test.mySqrt(256));
		System.out.println(test.mySqrt(2147395600));
	}
}
