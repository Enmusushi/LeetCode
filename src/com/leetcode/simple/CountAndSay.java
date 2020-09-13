package com.leetcode.simple;
/**
 * 38. 外观数列
 * @author enmu
 *
 */
public class CountAndSay {
	private String ans = "";
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		} else {
			ans = countAndSay(n - 1);
			if (ans.length() == 1) {
				return "1" + ans;
			} else {
				char ch;
				int count = 1;
				String cur = "";
				for (int i = 0; i < ans.length(); i++) {
					ch = ans.charAt(i);
					count = 1;
					for (int j = i + 1; j < ans.length(); j++) {
						if (ch == ans.charAt(j)) {
							count++;
						} else {
							break;
						}
					}
					cur=cur+ count + ch;
					i += count - 1;
				}
				ans = cur;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		CountAndSay test = new CountAndSay();
		System.out.println(test.countAndSay(1));
		System.out.println(test.countAndSay(2));
		System.out.println(test.countAndSay(3));
		System.out.println(test.countAndSay(4));
		System.out.println(test.countAndSay(5));
	}
}
