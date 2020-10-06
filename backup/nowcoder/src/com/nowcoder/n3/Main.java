package com.nowcoder.n3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp;
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] nums = new int[n];
			int no = 0;
			for (int i = 0; i < n; i++) {
				temp = scanner.nextInt();
				no++;
				for (int j = no; j >= 0; j--) {
					if (nums[j] < nums[j - 1]) {
						int exchange = nums[j];
						nums[j] = nums[j - 1];
						nums[j - 1] = exchange;
					}else if(nums[j]==nums[j-1]){
						no--;
					}else {
						
					}
				}

			}

		}
	}
}
