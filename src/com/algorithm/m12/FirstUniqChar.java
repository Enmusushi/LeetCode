package com.algorithm.m12;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
    	//char[] chs = s.toCharArray();
    	for(int i=0;i<s.length();i++) {
    		boolean isNotExisted = true;
    		for(int j=i+1;j<s.length();j++) {
    			if(s.charAt(i)==s.charAt(j)) {
    				isNotExisted = false;
    				break;
    			}
    			
    		}
    		if(isNotExisted) {
    			return i;
    		}
    	}
		return -1;
    }
}
