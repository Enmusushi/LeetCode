package com.leetcode.simple;

import java.util.LinkedList;
import java.util.List;

/**
 * 101. 对称二叉树
 * 
 * @author enmu
 *
 */

public class IsSymmetric {
	private List<List<Integer>> ansList = new LinkedList<List<Integer>>();
	
	//1ms 29.30%
	public boolean isSymmetric2(TreeNode root) {
		if(root==null) {
			return true;
		}
		return isSymmetricDFS(root.left,root.right); 
		
	}
	public boolean isSymmetricDFS(TreeNode l, TreeNode r) {
		if (l == r) {
			return true;
		} else if (l == null || r == null) {
			return false;
		} else if (l.val == r.val) {
			return isSymmetricDFS(l.left, r.right) && isSymmetricDFS(l.right, r.left);
		}
		return false;
	}
	//参考别人的  0ms , 100%
	private boolean isSymmetric = true;
	public boolean isSymmetric(TreeNode root) {
		isSymmetric(root,root);
		return isSymmetric;
	}
	public void isSymmetric(TreeNode l,TreeNode r) {
		if(l==null&&r==null) {
			return;
		}else if(l==null||r==null) {
			isSymmetric = false;
			return;
		}
		isSymmetric(l.left,r.right);
		if(l.val!=r.val) {
			isSymmetric = false;
		}
		isSymmetric(l.right,r.left);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left1 = new TreeNode(2);
		TreeNode left2 = new TreeNode(3);
		TreeNode left3 = new TreeNode(4);
		TreeNode right1 = new TreeNode(2);
		TreeNode right2 = new TreeNode(3);
		TreeNode right3 = new TreeNode(4);
		root.left = left1;
		root.right = right1;
		left1.left = left2;
		left1.right = left3;
		right1.left = right3;
		right1.right = right2;
		IsSymmetric test = new IsSymmetric();
		System.out.println(test.isSymmetric(root));
		System.out.println(test.ansList);
	}
}
