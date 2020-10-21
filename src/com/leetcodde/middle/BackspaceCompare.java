package com.leetcodde.middle;

public class BackspaceCompare {
    public boolean backspaceCompare(String S, String T) {
    	boolean flag = false;
    	int equalNum = 0;
    	for(int i=S.length()-1,j=T.length()-1;i>=0&&j>=0;i--,j--) {
    		if(S.charAt(i)==T.charAt(j)) {
    			equalNum++;
    		}
    		if(S.charAt(i)=='#') {
    			
    		}
    	}
    	
    	
    	
		return flag;
    }
}
