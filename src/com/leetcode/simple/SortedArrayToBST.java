package com.leetcode.simple;

/**
 * 108. 将有序数组转换为二叉搜索树
 * @author enmu
 *
 */
public class SortedArrayToBST {
	private TreeNode root;
	public TreeNode sortedArrayToBST(int[] nums) {
		root = sortedArrayToBST(nums,0,nums.length-1);
		return root;
	}

	public TreeNode sortedArrayToBST(int[] nums, int l, int r) {
		if(r<l) {
			return null;
		}
		int mid = (l+r)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left=sortedArrayToBST(nums,l,mid-1);
		node.right=sortedArrayToBST(nums,mid+1,r);
		return node;
	}

	public static void main(String[] args) {
		int[] nums = { -10, -3, 0, 5, 9 };
		SortedArrayToBST test = new SortedArrayToBST();
		test.sortedArrayToBST(nums);
		VisitTree printTree = new VisitTree();
		printTree.dfs_Front(test.root);
		System.out.println();
		printTree.dfs_Middle(test.root);
		System.out.println();
		printTree.dfs_Rear(test.root);
	}
}
