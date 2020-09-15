package com.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * 
 * @author admin
 *
 */
public class BinaryTreePaths {

	private List<String> ans = new ArrayList<String>();

	public List<String> binaryTreePaths(TreeNode root) {
		binaryTreePathsDFS2(root, "");
		return ans;
	}

	/*
	 * 执行用时：11 ms, 在所有 Java 提交中击败了42.61%的用户 内存消耗：39.7 MB, 在所有 Java 提交中击败了92.03%的用户
	 */
	// 初次写，有很多多余的判断
	public void binaryTreePathsDFS(TreeNode root, String path) {
		if (root != null && (root.left == null && root.right == null)) {
			ans.add(path + root.val);
		} else if (root == null) {
			return;
		}
		if (root.left != null) {
			binaryTreePathsDFS(root.left, path + root.val + "->");
		}
		if (root.right != null) {
			binaryTreePathsDFS(root.right, path + root.val + "->");
		}
	}

	// 优化判断,反而会因递归的层数增加

	/*
	  	执行用时：12 ms, 在所有 Java 提交中击败了25.36%的用户
		内存消耗：40 MB, 在所有 Java 提交中击败了42.73%的用户
	 */
	public void binaryTreePathsDFS3(TreeNode root, String path) {
		if (root == null) {
			return;
		} else if (root.left == null && root.right == null) {
			ans.add(path + root.val);
		}
		binaryTreePathsDFS3(root.left, path + root.val + "->");
		binaryTreePathsDFS3(root.right, path + root.val + "->");
	}

	// 用StringBuffer优化试试
	/*
	 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户 内存消耗：39.9 MB, 在所有 Java 提交中击败了49.53%的用户
	 */
	public void binaryTreePathsDFS2(TreeNode root, String path) {
		if (root == null) {
			return;
		}
		StringBuffer buffer = new StringBuffer(path);
		if (root.left == null && root.right == null) {
			ans.add(buffer.append(root.val).toString());
			return;
		}
		buffer.append(root.val);
		buffer.append("->");
		binaryTreePathsDFS2(root.left, buffer.toString());
		binaryTreePathsDFS2(root.right, buffer.toString());
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
		BinaryTreePaths test = new BinaryTreePaths();
		System.out.println(test.binaryTreePaths(root));
	}
}
