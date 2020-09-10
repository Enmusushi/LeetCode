package com.leetcode.m09;

/**
 * 657. 机器人能否返回原点（每日一题）
 */
public class JudgeCircle {
	
	//优化，可以只用两个变量保存上下、左右方向
	public boolean judgeCircle(String moves) {
		int up=0;
		int down=0;
		int left = 0;
		int right =0;
		int length = moves.length();
		for(int i=0;i<length;i++)
		{
			switch(moves.charAt(i)) {
			case 'U':up++;break;
			case 'D':down++;break;
			case 'L':left++;break;
			case 'R':right++;break;
			}
		}
		if(up==down&&left==right) {
			return true;
		}
		return false;
    }
}
