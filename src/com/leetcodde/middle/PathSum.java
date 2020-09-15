package com.leetcodde.middle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 113. 路径总和 II
 * @author admin
 * 	 未完成
 */

public class PathSum {
	private List<List<Integer>> ans = new LinkedList<List<Integer>>();
	private List<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	pathSumDFS(root,sum);
		return ans;
    }
    public void pathSumDFS(TreeNode root,int sum) {
    	if(root==null) {
    		return ;
    	}else if(root.left==null&&root.right==null&&sum==root.val) {
    		temp.add(root.val);
    		ans.add(new ArrayList<Integer>(temp));
    		return;
    	}
    	if(sum>=root.val) {
    		if(root.left!=null) {
    			temp.add(root.val);
    			pathSumDFS(root.left,sum-root.val);
    			temp.remove(temp.size()-1);
        	}
    		if(root.right!=null) {
    			temp.add(root.val);
    			pathSumDFS(root.right,sum-root.val);
    			temp.remove(temp.size()-1);
        	}
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
		TreeNode right4 = new TreeNode(4);
		TreeNode right5 = new TreeNode(4);
		root.left = left1;
		root.right = right1;
		left1.left = left2;
		left1.right = left3;
		right1.left = right3;
		right1.right = right2;
		PathSum test = new PathSum();
		test.pathSum(root, 7);
		System.out.println(test.ans);
	}
    
}
