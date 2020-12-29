package com.leetcode.hard;

import java.util.Arrays;

public class Candy {
	public int candy(int[] ratings) {
		int[] candies = new int[ratings.length];
		for (int i = 0; i < candies.length; i++) {
			candies[i] = 1;
		}
		for (int i = 0; i < ratings.length - 1; i++) {
			if (ratings[i] < ratings[i + 1]) {
				candies[i + 1] = candies[i] + 1;
			}
		}
		int sum = 0;
		int i = ratings.length - 1;
		while (i >= 1) {
			if (ratings[i] < ratings[i - 1]) {
				if (candies[i] >= candies[i - 1]) {
					candies[i - 1] = candies[i] + 1;
				}
			}
			sum += candies[i];
			i--;
		}
		sum += candies[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] ratings = { 1, 2, 2 };
		Arrays.fill(ratings, 1);
		Candy candy = new Candy();
		System.out.println(candy.candy(ratings));
	}
}
