package com.leetcode.simple;
/**
 * 112. 路径总和
 * @author enmusushi
 *
 */
public class HasPathSum {
	private boolean hasPathSum = false;

	public boolean hasPathSum(TreeNode root, int sum) {
		hasPathSumDFS(root, sum, 0);
		return hasPathSum;
	}

	public void hasPathSumDFS(TreeNode root, int sum, int cal) {
		if (root != null && (root.left == null && root.right == null) && (root.val+cal) == sum) {
			hasPathSum = true;
		} else if (root == null) {
			return;
		}
		if (root.left != null) {
			hasPathSumDFS(root.left, sum, cal + root.val);
		}
		if (root.right != null) {
			hasPathSumDFS(root.right, sum, cal + root.val);
		}
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
		HasPathSum test = new HasPathSum();
		System.out.println(test.hasPathSum(root, 6));
	}

}
