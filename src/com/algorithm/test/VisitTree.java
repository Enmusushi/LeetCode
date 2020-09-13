package com.algorithm.test;


public class VisitTree {
	
	//Ê÷µÄ±éÀú
	public void dfs(TreeNode root) {
		if(root==null) {
			return;
		}
		dfs(root.left);
		System.out.print(root.val+" ");
		dfs(root.right);
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
		test.dfs(root);
	}
}
