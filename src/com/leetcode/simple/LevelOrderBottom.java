package com.leetcode.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. 二叉树的层次遍历 II
 * 
 * @author enmu
 *
 */
public class LevelOrderBottom {
	private List<List<Integer>> ans = new LinkedList<List<Integer>>();
	// 1ms 98.21%
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		levelOrderBottomDFS(root,0);
		return ans;
	}
	public void levelOrderBottomDFS(TreeNode root,int depth) {
		if(root==null) {
			return;
		}
		if(ans.size()==depth) {
			ans.add(0,new ArrayList<>());
		}
		ans.get(ans.size()-depth-1).add(root.val);
		levelOrderBottomDFS(root.left,depth+1);
		levelOrderBottomDFS(root.right,depth+1);
	}
	// 1ms 98.21%
	private List<Integer> temp = new ArrayList<Integer>();
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.offer(root);
		}
		TreeNode node = null;
		int size = 0;
		while (!queue.isEmpty()) {
			size = queue.size();
			while (size > 0) {
				node = queue.poll();
				temp.add(node.val);
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				size--;
			}
			ans.add(0, new ArrayList<>(temp));

			temp.clear();
		}
		return ans;
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
		LevelOrderBottom test = new LevelOrderBottom();
		System.out.println(test.levelOrderBottom(root));
	}

}
