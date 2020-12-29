package com.leetcodde.middle;

public class LongestMountain {
	public int longestMountain(int[] A) {
		if (A.length < 3) {
			return 0;
		}
		int up = 0;
		int down = 0;
		int pre = A[0];
		int ans = 0;
		for(int i=1;i<A.length;i++) {
			if(A[i]>pre) {
				if(down==0) {
					up=up==0?2:++up;
				}else {
					int tmp = up+down;
					ans = tmp>ans?tmp:ans;
					up=2;
					down =0;
				}
			}else if(A[i]<pre) {
				down = up>0?++down:0;
			}else {
				if(up>0&&down>0) {
					int tmp = up+down;
					ans = tmp>ans?tmp:ans;
				}
				up=0;
				down =0;
			}
			pre = A[i];
		}
		int tmp = up+down;
		if(ans>tmp) {
			return ans;
		}else if(up>1&&down>0){
			return tmp;
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] A = {875,884,239,731,723,685};
		int[] B = {0,0,1,0,0,1,1,1,1,1};
		LongestMountain test = new LongestMountain();
//		System.out.println(test.longestMountain(A));
		System.out.println(test.longestMountain(B));
	}
}
