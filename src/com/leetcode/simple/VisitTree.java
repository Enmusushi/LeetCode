package com.leetcode.simple;
public class VisitTree {
	public void dfs_Front(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		dfs_Front(root.left);
		dfs_Front(root.right);
	}
	public void dfs_Middle(TreeNode root) {
		if(root==null) {
			return;
		}
		dfs_Middle(root.left);
		System.out.print(root.val+" ");
		dfs_Middle(root.right);
	}
	public void dfs_Rear(TreeNode root) {
		if(root==null) {
			return;
		}
		dfs_Rear(root.left);
		dfs_Rear(root.right);
		System.out.print(root.val+" ");
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
		VisitTree test = new VisitTree();
		test.dfs_Front(root);
		System.out.println();
		test.dfs_Middle(root);
		System.out.println();
		test.dfs_Rear(root);
	}
}
