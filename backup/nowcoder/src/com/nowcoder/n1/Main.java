package com.nowcoder.n1;

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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Main test = new Main();
		System.out.print(test.lengthOfTheLastWord2(words));
		
	}
// 24ms不通过
	public int lengthOfTheLastWord(String words) {
		String[] wordArray= words.split(" ");	
		return wordArray[wordArray.length-1].length();
	}
//24ms不通过
	public int lengthOfTheLastWord2(String words) {
		
		return words.length() -words.lastIndexOf(' ')-1;
	}
}
