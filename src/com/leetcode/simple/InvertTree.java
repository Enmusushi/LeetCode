package com.leetcode.simple;
/**
 * 226. 翻转二叉树
 * @author admin
 *
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
    	if(root == null)
    	{
    		return root;
    	}
    	TreeNode temp = root.left;
    	root.left=invertTree(root.right);
    	root.right=invertTree(temp);
    	return root;
    }
    
}
