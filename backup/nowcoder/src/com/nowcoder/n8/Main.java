package com.nowcoder.n8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(
				new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null) {
			String[] intValues = str.split("\\.",2);
			int ans = Integer.valueOf(intValues[0]);
			if(intValues[1].charAt(0)>='5') {
				ans++;
			}
			System.out.println(ans);
		}
		
	}
}	
	
	
	
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) { BufferedReader br = new
	 * BufferedReader(new InputStreamReader(System.in)); Stream<String> str =
	 * br.lines(); str.forEach(Main::printRound); } public static void
	 * printRound(String s) { if (s != null && !"".equals(s)) {
	 * System.out.println(Math.round(Float.valueOf(s))); } }
	 */

