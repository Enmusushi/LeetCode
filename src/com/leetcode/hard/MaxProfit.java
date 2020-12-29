package com.leetcode.hard;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfit {
	public int maxProfit(int k, int[] prices) {
		Integer[] curProfits = new Integer[prices.length/2];
		int top=0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i;j<prices.length-1;j++) {
				if(prices[j+1]>prices[j]) {
					continue;
				}else {
					if(i==j) {
						break;
					}
					else if(j>i) {
						curProfits[top]=prices[j]-prices[i];
						top++;
						k--;
						i=j;
						break;
					}
					
				}
			}
		}
		if(k>curProfits.length) {
			
		}
		//Arrays.sort(curProfits,(v1,v2)->{if(v1>v2) {return v1;}else{return v2;}});
		Arrays.sort(curProfits,(v1,v2)->{return v1>v2?v1:v2;});
		/*
		 * Arrays.sort(curProfits,new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { return 0; } });
		 */
		
		int sum =0;
		for(int i=0;i<curProfits.length;i++) {
			sum+=curProfits[i];
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] prices = {3,2,6,5,0,3};
		MaxProfit test= new MaxProfit();
		System.out.println(test.maxProfit(2, prices));
	}
}
