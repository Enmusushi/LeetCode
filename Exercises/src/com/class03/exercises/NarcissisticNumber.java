package com.class03.exercises;

public class NarcissisticNumber {
	public void narcissisticNumber() {
		int theUnit = 0;
		int ten = 0;
		int hundred = 0;
		int cubicSum = 0;
		for(int i=100;i<1000;i++) {
			theUnit = i%10;
			ten = i/10%10;
			hundred = i/100;
			cubicSum += (int) Math.pow(theUnit, 3);
			cubicSum += (int) Math.pow(ten, 3);
			cubicSum += (int) Math.pow(hundred, 3);
			if(cubicSum==i) {
				System.out.println(i);
			}
			cubicSum = 0;
		}
	}
	public static void main(String[] args) {
		NarcissisticNumber test= new NarcissisticNumber();
		test.narcissisticNumber();
	}
}
