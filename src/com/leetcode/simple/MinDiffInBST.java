package com.leetcode.simple;

/**
 * 783. 二叉搜索树节点最小距离
 * 	此题意思表达不清
 * @author admin
 *
 */
public class MinDiffInBST {

	/*
	 * 没有想出来，用中序遍历可以简单的解出，递归关注当前层 private int min = Integer.MAX_VALUE; public int
	 * minDiffInBST(TreeNode root) { if(root!=null) { minDiffInBSTDFS(root); return
	 * min; } return 0; } public void minDiffInBSTDFS(TreeNode root) { if(root ==
	 * null) { return ; } minDiffInBSTDFS(root.left); minDiffInBSTDFS(root.right);
	 * int curMin = minDiffAtNode(root); if(min>curMin) { min = curMin; } } public
	 * int minDiffAtNode(TreeNode root) { if (root.left != null && root.right !=
	 * null) { return Math.min(Math.abs(root.val - root.left.val), Math.abs(root.val
	 * - root.right.val)); } else if (root.left != null) { return Math.abs(root.val
	 * - root.left.val); } else if (root.right != null) { return Math.abs(root.val -
	 * root.right.val); } return min; }
	 */

	// 参考
	private Integer prev = null;
	private Integer ans = null;

	public int minDiffInBST(TreeNode root) {
		ans = Integer.MAX_VALUE;
		dfs(root);
		return ans;
	}

	public void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs(root.left);
		if (prev != null) {
			ans = Math.min(ans,root.val - prev);
		}
		prev = root.val;
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
		MinDiffInBST test  = new MinDiffInBST();
		System.out.println(test.minDiffInBST(root));
	}

}
