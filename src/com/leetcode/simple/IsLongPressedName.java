package com.leetcode.simple;

/**
 * 925. 长按键入
 * 
 * @author admin
 *
 */
public class IsLongPressedName {
	public boolean isLongPressedName(String name, String typed) {
		if (typed.length() < name.length()) {
			return false;
		}
		int i=0;
		for (int j = 0; j < typed.length();) {
			if (i<name.length()&&name.charAt(i) == typed.charAt(j)) {
				i++;
				j++;
			} else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
				j++;
			}else {
				return false;
			}
		}
		return i==name.length();
	}

	public static void main(String[] args) {
		IsLongPressedName test = new IsLongPressedName();

		System.out.println(test.isLongPressedName("alex", "aaleex"));
		System.out.println(test.isLongPressedName("saeed", "ssaaedd"));
		System.out.println(test.isLongPressedName("leelee", "lleeelee"));

		System.out.println(test.isLongPressedName("vtkgn", "vttkgnn"));
	}
}
