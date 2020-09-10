package com.leetcode.m09;

import java.util.Stack;
/**
 * 
 * 20. 有效的括号
 *
 */
public class IsValid_Brackets {
	public boolean isValid(String s) {
		 char[] brackets = s.toCharArray();
		 Stack<Character> stack = new Stack<Character>();
		 for(char ch : brackets) {
			 if("{[(".indexOf(ch)!=-1) {
				 stack.push(ch);
			 }else if(stack.isEmpty()) {
				 return false;
			 }
			 else if("}])".indexOf(ch)=="{[(".indexOf(stack.peek())) {
				 stack.pop();
			 }else {
				 return false;
			 }
		 }
		 if(stack.isEmpty()) {
			 return true;
		 }
		 return false;
	 }
	public static void main(String[] args) {
//		System.out.println(test.reverse(123));
//		System.out.println(test.isValid("()"));
//		System.out.println(test.isValid("]"));
//		System.out.println(test.isValid("(])"));
	}
}
