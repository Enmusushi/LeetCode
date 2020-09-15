package com.syntax.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate{
	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = dateFormat.format(now);
		System.out.println(dateStr);
		
	}
}