package com.algorithm.m12;

import java.util.Arrays;

public class FindContentChildren {
	public int findContentChildren(int[] g, int[] s) {
		int satisfiedNum = 0;
		Arrays.sort(g, 0, g.length);
		Arrays.sort(s, 0, s.length);
		int i = 0, j = 0;
		while(i<g.length&&j<s.length) {
			if(g[i]<=s[j]) {
				satisfiedNum++;
				i++;
			}
			j++;
		}
		return satisfiedNum;
	}
}
