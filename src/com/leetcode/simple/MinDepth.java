package com.leetcode.simple;

public class MinDepth {

	public int minDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left!=0&&right!=0)?Math.min(left, right)+1:left+right+1;
	}

	// 无法判断根节点只有一个叶子节点的情况
	public int minDepthDFS(TreeNode root, int deepth) {
		if (root == null) {
			return deepth;
		}
		int left = minDepthDFS(root.left, deepth + 1);
		int right = minDepthDFS(root.right, deepth + 1);
		return Math.min(left, right);
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
		MinDepth test = new MinDepth();
		System.out.println(test.minDepth(root));
	}
}
