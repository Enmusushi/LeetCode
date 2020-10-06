package com.leetcode.m09;

import java.util.List;

public class SolveNQueens {
	private int n = 8;
	private int tot = 0;
	private int[] C = new int[n];

	public void search(int cur) {
		if (cur == n) {
			tot++;
			for(int i=0;i<n;i++) {
				
			}
			
		} else
			for (int i = 0; i < n; i++) {
				boolean isCanLaid = true;
				C[cur] = i;
				for (int j = 0; j < cur; j++) {
					if (C[cur] == C[j] || cur - C[cur] == j - C[j] || cur + C[cur] == j + C[j]) {
						isCanLaid = false;
						break;
						
					}
				}
				if(isCanLaid) {
					search(cur+1);
				}

			}
	}

	public List<List<String>> solveNQueens(int n) {
		return null;
	}

	public void solveNQueensDFS(int n) {

	}

	public static void main(String[] args) {
		SolveNQueens test = new SolveNQueens();
		test.search(0);
		System.out.println(test.tot);
	}
}
