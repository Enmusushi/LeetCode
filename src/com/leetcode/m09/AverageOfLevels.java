package com.leetcode.m09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 	637. 二叉树的层平均值(2020-09-12 每日一题)
 * @author enmu
 *
 */

//层次遍历，队列
/*
 *参考别人的 
 */
public class AverageOfLevels {
	//DFS
	private List<Integer> countsOfLevel = new ArrayList<Integer>(); 
	private List<Double> sumsOfLevel = new ArrayList<Double>();
	public List<Double> averageOfLevels2(TreeNode root) {
		
		
		return sumsOfLevel;
	}
	public void averageOfLevelsDFS(TreeNode root,int index) {
		if(root==null) {
			return;
		}
		
		
	}
	
	
	public List<Double> averageOfLevels(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<Double> averages = new LinkedList<Double>();
		if(root == null) {
			return null;
		}else {
			queue.offer(root);
		}
		int count = 0;
		int size = 0;
		double sum;
		while(!queue.isEmpty()) {
			count = queue.size();
			size = count;
			sum=0;
			while(size>0) {
				root = queue.poll();
				sum += root.val;
				if(root.left!=null) {
					queue.offer(root.left);
				}
				if(root.right!=null) {
					queue.offer(root.right);
				}
				size--;
			}
			averages.add(sum/count);
		}
		return averages;
	}
	public static void main(String[] args) {
		TreeNode[] tree = new TreeNode[5];
		for(int i=0;i<tree.length;i++) {
			tree[i]= new TreeNode(0);
		}
		TreeNode root = tree[0];
		tree[0].val = 3;
		tree[0].left = tree[1];
		tree[0].right= tree[2];
		tree[1].val= 9;
		tree[1].left = null;
		tree[1].right = null;
		tree[2].val= 20;
		tree[2].left = tree[3];
		tree[2].right = tree[4];
		tree[3].val= 15;
		tree[3].left = null;
		tree[3].right = null;
		tree[4].val= 7;
		tree[4].left = null;
		tree[4].right = null;
		AverageOfLevels test = new AverageOfLevels();
		
		test.averageOfLevels(root);;
	}
}
