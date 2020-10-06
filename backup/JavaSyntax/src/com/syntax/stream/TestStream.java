package com.syntax.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestStream {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println(-1>>>1);
		try {
			char ch = 0;
			StringBuilder build = new StringBuilder();
			int isEnd = 0;
			while ((ch = (char) reader.read()) != -1) {
				if (ch != '\n') {
					build.append(ch);
					if (build.length() == 8) {
						System.out.println(build.toString());
						build.delete(0, build.length());
					}
				} else {
					if (build.length() > 0) {
						while (build.length() < 8) {
							build.append('0');
						}
						System.out.println(build.toString());
						build.delete(0, build.length());
					}
					isEnd++;
					if (isEnd == 2)
						break;
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
