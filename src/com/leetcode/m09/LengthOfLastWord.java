
package com.leetcode.m09;
/**
 * 58. 最后一个单词的长度
 * 测试数据刁钻
 *
 */
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		/*
		 * int index =s.indexOf(' '); if(index>-1) { return index; }else { return
		 * s.length(); }
		 */
		s = s.trim();
		int index = s.lastIndexOf(' ');
		if (index > -1) {
			return s.length() - index - 1;
		} else {
			return s.length();
		}
	}
	public static void main(String[] args) {
//		System.out.println(test.lengthOfLastWord(" a"));
//		System.out.println(test.lengthOfLastWord("a "));
//		System.out.println(test.lengthOfLastWord(" "));
	}
}
