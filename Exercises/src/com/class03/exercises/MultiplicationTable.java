package com.class03.exercises;

public class MultiplicationTable {
	public void multiplicationTable() {
		for(int i=1;i<10;i++) {
			int j=1;
			while(j<i) {
				System.out.print(j+"X"+i+"="+(i*j)+"\t");
				j++;
			}
			System.out.print(j+"X"+i+"="+(i*j));//最后一个不需要制表符;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MultiplicationTable test = new MultiplicationTable();
		test.multiplicationTable();
	}
}
