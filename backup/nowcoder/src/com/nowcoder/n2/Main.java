package com.nowcoder.n2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
	//	Scanner scanner = new Scanner(System.in);
	//	String words = scanner.nextLine();
		//提高输入效率
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		String words="";
		try {
			
			words = br.readLine();
			String character = br.readLine();
			char ch = character.charAt(0);
			int count = 0;
			for(int i=0,length = words.length();i<length;i++) {
				char temp = words.charAt(i);
				if(ch==temp||ch == temp+32||ch==temp-32){
					count++;
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
