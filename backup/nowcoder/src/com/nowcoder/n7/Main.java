package com.nowcoder.n7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		long n = Long.valueOf(str);
		StringBuilder builder = new StringBuilder();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				builder.append(i).append(" ");
				n /= i;
			}
		}
		System.out.println(builder.toString());
	}
}
