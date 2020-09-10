package com.leetcode.m09;
/**
 * 13. 罗马数字转整数
 */
public class RomanToInt {
	public int romanToInt(String s) {
		int result = 0;
		int tempValue = 0;
		int currentValue = 0;
		for (char ch : s.toCharArray()) {
			currentValue = singleRomanToInt(ch);
			if (tempValue < currentValue) {
				result += currentValue - tempValue * 2;
			} else if (tempValue >= currentValue) {
				result += currentValue;
			}
			tempValue = singleRomanToInt(ch);
		}
		return result;
	}
	private int singleRomanToInt(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
	public static void main(String[] args) {
		//System.out.println(test.romanToInt("III"));
//		System.out.println(test.romanToInt("IV"));
//		System.out.println(test.romanToInt("IX"));
//		System.out.println(test.romanToInt("LVIII"));
//		System.out.println(test.romanToInt("MCMXCIV"));
	}
}
