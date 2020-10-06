package com.leetcode.simple;
/**
 * 404. 左叶子之和
 * @author enmusushi
 *
 */
public class SumOfLeftLeaves {
	private int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}else {
    		sumOfLeftLeavesDFS(root);
    	}
		return sum;
    }
    public void sumOfLeftLeavesDFS(TreeNode root) {
    	if(root.left!=null) {
    		if(root.left.left==null&&root.left.right==null) {
    			sum+=root.left.val;
    		}
    		sumOfLeftLeavesDFS(root.left);
    	}
    	if(root.right!=null) {
    		sumOfLeftLeavesDFS(root.right);
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
		SumOfLeftLeaves test = new SumOfLeftLeaves();
		test.sumOfLeftLeaves(root);
		System.out.println(test.sum);
	}
    
}
