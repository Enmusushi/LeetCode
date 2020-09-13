package com.leetcode.simple;


import java.util.ArrayList;
import java.util.List;

/**
 * 70. 爬楼梯
 * @author enmu
 *
 */
public class ClimbStairs{
	//超时
    public int climbStairsSlow(int n) {
    	if(n==1||n==0) {
    		return 1;
    	}
		return climbStairsSlow(n-1)+climbStairsSlow(n-2);
    }
    //1ms  100.00%
    public int climbStairs(int n) {
    	if(n==1) {
    		return 1;
    	}
    	List<Integer> ans = new ArrayList<Integer>();
    	ans.add(1);
    	ans.add(1);
    	for(int i=2;i<=n;i++) {
    		ans.add(ans.get(i-1)+ans.get(i-2));
    	}
		return ans.get(ans.size()-1);
    }
    
    
    public static void main(String[] args) {
    	ClimbStairs test = new ClimbStairs();
		System.out.println(test.climbStairsSlow(2));
		System.out.println(test.climbStairsSlow(3));
		System.out.println(test.climbStairs(45));
		System.out.println(test.climbStairsSlow(45));
	}
}
