package com.leetcode.simple;

public class GetMinimumDifference {
	private Integer ans = Integer.MAX_VALUE;
	private Integer pre;
	
    public int getMinimumDifference(TreeNode root) {
    	
    	findMaxAndMin(root);
		return ans;
    }
    public void findMaxAndMin(TreeNode root) {
    	if(root ==  null) {
    		return;
    	}else {
    		findMaxAndMin(root.left);
    		if(pre!=null) {
        		ans = Math.min(ans, Math.abs(root.val-pre));
    		}
    		pre = root.val;
    		findMaxAndMin(root.right);
    	}
    	
    }
    public static void main(String[] args) {
		TreeNode root = new TreeNode(236);
		TreeNode left1 = new TreeNode(104);
		TreeNode left3 = new TreeNode(227);
		TreeNode right1 = new TreeNode(701);
		TreeNode right3 = new TreeNode(911);
		root.left = left1;
		root.right = right1;
		left1.right = left3;
		right1.right = right3;
		GetMinimumDifference test = new GetMinimumDifference();
		System.out.println(test.getMinimumDifference(root));
		
	}
}
