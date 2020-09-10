package com.leetcode.m09;
/**
 * 67. 二进制求和
 */
public class AddBinary {
	//自己写的，比较慢
	public String addBinarySlow(String a, String b) {
    	int last = a.length()<b.length()?a.length():b.length();
    	int c =0 ;
    	String result = "";
    	int i =0;
    	String prefix = "";
    	int x =0;
    	int y =0;
    	while(i<last||c==1) {
    		if(i<a.length()) {
    			 x = a.charAt(a.length()-i-1)=='0'?0:1;
    		}
    		else {
    			x =0;
    		}
    		if(i<b.length()) {
    			y = b.charAt(b.length()-i-1)=='0'?0:1;
    		}else {
    			y =0;
    		}
    		result =""+(c^x^y)+result;   
    		if(c+x+y>1) {
    			c=1;
    			
    		}else {
    			c=0;
    			
    		}
    		i++;
    		
    	}
    	if(i<a.length()) {
			 x = a.charAt(a.length()-i-1)=='0'?0:1;
			 prefix = a.substring(0,a.length()-i);
		}
		else {
			x =0;
		}
		if(i<b.length()) {
			y = b.charAt(b.length()-i-1)=='0'?0:1;
			 prefix = b.substring(0,b.length()-i);
			
		}else {
			y =0;
		}
		result =prefix+(c==0?"":"1")+result;
    	return result;
    }
	//优化
	public String addBinary(String a, String b) {
		char[] m = a.toCharArray();
		char[] n = b.toCharArray();
		int last = m.length<n.length?m.length:n.length;
		StringBuffer buffer = new StringBuffer();
    	int c =0 ;
    	StringBuffer result = new StringBuffer();
    	int i =0;
    	int x =0;
    	int y =0;
    	while(i<last||c==1){
    		if(i<m.length) {
    			 x = m[m.length-i-1]-'0';
    		}else {
    			x=0;
    		}
    		
    		if(i<n.length) {
    			 y = n[n.length-i-1]-'0';
    		}else {
    			y=0;
    		}
    		
    		buffer.append(c^x^y);
    		if(c+x+y>1) {
    			c=1;
    			
    		}else {
    			c=0;
    			
    		}
    		i++;
    	}
    	if(i<a.length()) {
    		 x = m[m.length-i-1]-'0';
    		 result.append(a.substring(0,a.length()-i));
		}
		else {
			x =0;
		}
		if(i<b.length()) {
			 y = n[n.length-i-1]-'0';
			 result.append(b.substring(0,b.length()-i));
			
		}else {
			y =0;
		}
		result.append(c==0?"":"1");
		result.append(buffer.reverse());
    	return result.toString();
    }
	
}
