package com.leetcode.simple;
/**
 * 110. 平衡二叉树
 * @author enmusushi
 * 110. Balanced Binary Tree
 * It belongs to easy problem but I cam't solve;
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
		return height(root)>=0;
    }
    public int height(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	int leftHeight = height(root.left);
    	int rightHeight = height(root.right);
    	if(leftHeight == -1 || rightHeight == -1||
    			Math.abs(leftHeight - rightHeight) > 1) {
    		return -1;
    	}
		return Math.max(leftHeight,rightHeight)+1;
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
		IsBalanced test = new IsBalanced();
		System.out.println(test.isBalanced(root));
	}
}
