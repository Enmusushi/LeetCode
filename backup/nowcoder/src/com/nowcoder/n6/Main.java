package com.nowcoder.n6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		String str;
		while((str=reader.readLine())!=null) {
			int bits=0;
			long ans = 0;
			for(int i=str.length()-1;i>=0;i--) {
				char ch = str.charAt(i);
				if(ch>='A'&&ch<='F') {
					ans +=((int)ch-55) * Math.pow(16, bits++);
				}else if(Character.isDigit(ch)) {
					ans +=((int)ch-48) * Math.pow(16, bits++);
				}
			}
			System.out.println(ans);
		}
		
	}
}
