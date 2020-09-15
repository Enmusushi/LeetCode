package com.leetcode.simple;

import java.util.List;

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};
/**
 * 559. N叉树的最大深度
 * @author admin
 *
 */

public class MaxDepth {
	/*
	  	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
		内存消耗：40.2 MB, 在所有 Java 提交中击败了10.66%的用户

	 */
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		int max = 0;
		if (root.children != null) {
			for (int i = 0; i < root.children.size(); i++) {
				if(root.children.get(i)!=null) {
					int temp = maxDepth(root.children.get(i));
					if(max<temp) {
						max = temp;
					}
				}
			}
		}
		return max+1;
	}
}
