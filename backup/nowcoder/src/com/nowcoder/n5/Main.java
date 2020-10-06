package com.nowcoder.n5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] isInput = new boolean[1001];
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int index = sc.nextInt();
				isInput[index] = true;
			}
		
			for (int i = 0; i < 1001; i++) {
				if (isInput[i]) {
					System.out.println(i);
					isInput[i]=false;
				}
			}
		}
	}
}
