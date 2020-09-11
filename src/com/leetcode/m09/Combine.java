package com.leetcode.m09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * 每日一题：77.组合
 */
public class Combine {
	
	/*
	 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

		示例:
		
		输入: n = 4, k = 2
		输出:
		[
		  [2,4],
		  [3,4],
		  [2,3],
		  [1,2],
		  [1,3],
		  [1,4],
		]

	 * 
	 * 
	 */
	//274ms通过，太差劲了
	/*  LinkList
	 * 执行用时：274 ms, 在所有 Java 提交中击败了5.09%的用户
	内存消耗：42.5 MB, 在所有 Java 提交中击败了12.59%的用户
	 */
	/*  ArrayList
	 * 执行用时：186 ms, 在所有 Java 提交中击败了5.09%的用户
	 * 内存消耗：41.1 MB, 在所有 Java 提交中击败了67.33%的用户
	 */
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		List<Integer> one = new ArrayList<Integer>();
		boolean[] visited = new boolean[n+1];
		combineDFS(res,one,visited,n,k);
		return res;
	}
	public void combineDFS(List<List<Integer>> res, List<Integer> one,boolean[] visited, int n,int k) {
		if(one.size()==k) {
			res.add(new ArrayList<Integer>(one));
			return;
		}
		for(int i=1;i<=n;i++) {
			if(visited[i]) {
				continue;
			}
			if(!one.isEmpty()&&one.get(one.size()-1)>i)
			{
				continue;
			}
			visited[i]= true;
			one.add(i);
			combineDFS(res,one,visited,n,k);
			visited[i]=false;
			one.remove(one.size()-1);
		}
		
	}
	/*
	 * 学习官方 
	 * 执行用时：2 ms, 在所有 Java 提交中击败了97.60%的用户
	   内存消耗：41.3 MB, 在所有 Java 提交中击败了38.67%的用户
	 */
	class Solution {
	    List<Integer> temp = new ArrayList<Integer>();
	    List<List<Integer>> ans = new ArrayList<List<Integer>>();
	    public List<List<Integer>> combine(int n, int k) {
	        dfs(1, n, k);
	        return ans;
	    }
	    public void dfs(int cur, int n, int k) {
	        // 剪枝：temp 长度加上区间 [cur, n] 的长度小于 k，不可能构造出长度为 k 的 temp
	        if (temp.size() + (n - cur + 1) < k) {
	            return;
	        }
	        // 记录合法的答案
	        if (temp.size() == k) {
	            ans.add(new ArrayList<Integer>(temp));
	            return;
	        }
	        // 考虑选择当前位置
	        temp.add(cur);
	        dfs(cur + 1, n, k);
	        temp.remove(temp.size() - 1);
	        // 考虑不选择当前位置
	        dfs(cur + 1, n, k);
	    }
	}
	

	public List<List<Integer>> combine2(int n, int k) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		//int[] nums = new int[n];
		for(int i=1;i<=k;i++) {
			temp.add(i);
		}
		temp.add(n+1);
		int j=0;
		while(j<k) {
			res.add(new ArrayList<Integer>(temp));
			j=0;
			while(j<k&&temp.get(j)+1==temp.get(j+1)) {
				temp.set(j, j+1);
				j++;
			}
		}
		//for(int j=k-1;j++)
		
		
		
		
		return res;
	}
	public static void main(String[] args) {
		Combine test = new Combine();
		System.out.println(test.combine(5, 3));
		System.out.println();
		Solution2 solution2 = new Solution2();
		System.out.println(solution2.combine(5, 3));
		
	}
}
class Solution2 {
    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 初始化
        // 将 temp 中 [0, k - 1] 每个位置 i 设置为 i + 1，即 [0, k - 1] 存 [1, k]
        // 末尾加一位 n + 1 作为哨兵
        for (int i = 1; i <= k; ++i) {
            temp.add(i);
        }
        temp.add(n + 1);
        
        int j = 0;
        while (j < k) {
            ans.add(new ArrayList<Integer>(temp.subList(0, k)));
            j = 0;
            // 寻找第一个 temp[j] + 1 != temp[j + 1] 的位置 t
            // 我们需要把 [0, t - 1] 区间内的每个位置重置成 [1, t]
            while (j < k && temp.get(j) + 1 == temp.get(j + 1)) {
                temp.set(j, j + 1);
                ++j;
            }
            // j 是第一个 temp[j] + 1 != temp[j + 1] 的位置
            temp.set(j, temp.get(j) + 1);
        }
        return ans;
    }
}
