package com.nowcoder.n4;

import java.util.Scanner;
//Scanner doesn't have a method that named nextChar; 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		StringBuffer buffer = new StringBuffer();
		while (sc.hasNext()) {
			ch = (char) sc.nextInt();
			if (ch != '\n') {
				buffer.append(ch);
				if (buffer.length() == 8) {
					System.out.println(buffer.toString());
					buffer.delete(0, 8);
				}
			}else {
				while(buffer.length()<8) {
					buffer.append('0');
				}
				System.out.println(buffer.toString());
			}
		}
	}
}
