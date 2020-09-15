package com.syntax.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FormatTest {

	public static void main(String[] args) {
		File file = new File("E:\\Git\\LeetCode\\src\\com\\syntax\\test\\format.txt");
		BufferedReader reader = null;
		StringBuffer buffer = new StringBuffer();
		try {
			reader =new BufferedReader(new FileReader(file));
	        String tempStr;
	        int i=0;
	        while ((tempStr = reader.readLine()) != null) {
	        	buffer.append(tempStr);
	        	i++;
	        	if(i%5==0) {
	        		buffer.append("\r\n");
	        	}
	        }
	        reader.close();
	        System.out.println(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
