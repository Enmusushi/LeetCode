package com.algorithm.m12;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Deque<TreeNode> deque = new LinkedList<TreeNode>();
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		if (root != null) {
			deque.addFirst(root);
		}
		boolean isLeft = true;
		while (!deque.isEmpty()) {
			int size = deque.size();
			if (isLeft) {
				List<Integer> list = new ArrayList<Integer>();
				while (size > 0) {
					TreeNode tmp = deque.pollFirst();
					list.add(tmp.val);
					if (tmp.right != null) {
						deque.addLast(tmp.right);
					}
					if (tmp.left != null) {
						deque.addLast(tmp.left);
					}

					size--;
				}
				res.add(list);
				isLeft = false;
			} else {
				List<Integer> list = new ArrayList<Integer>();
				while (size > 0) {
					TreeNode tmp = deque.pollFirst();
					list.add(tmp.val);
					if (tmp.left != null) {
						deque.addLast(tmp.left);
					}
					if (tmp.right != null) {
						deque.addLast(tmp.right);
					}
					size--;
				}
				res.add(list);
				isLeft = true;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		TreeNode[] tree = new TreeNode[5];
		for(int i=0;i<tree.length;i++) {
			tree[i]= new TreeNode(0);
		}
		TreeNode root = tree[0];
		tree[0].val = 3;
		tree[0].left = tree[1];
		tree[0].right= tree[2];
		tree[1].val= 9;
		tree[1].left = null;
		tree[1].right = null;
		tree[2].val= 20;
		tree[2].left = tree[3];
		tree[2].right = tree[4];
		tree[3].val= 15;
		tree[3].left = null;
		tree[3].right = null;
		tree[4].val= 7;
		tree[4].left = null;
		tree[4].right = null;
		ZigzagLevelOrder test = new ZigzagLevelOrder();
		System.out.println(test.zigzagLevelOrder(root));
		
	}
}
