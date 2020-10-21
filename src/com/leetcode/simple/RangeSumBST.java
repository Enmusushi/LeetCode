package com.leetcode.simple;
/**
 * 938. 二叉搜索树的范围和
 * @author admin
 *
 */
public class RangeSumBST {
	private int sum = 0;
	private int valueL;
	private int valueR;
	public int rangeSumBST(TreeNode root, int L, int R) {
		valueL = L;
		valueR = R;
		if (root != null) {
			rangeSumBSTDFS(root);
		}
		return sum;
	}

	public void rangeSumBSTDFS(TreeNode root) {
		if (root.val >= valueL && root.val <= valueR) {
			sum += root.val;
			if (root.left != null) {
				rangeSumBSTDFS(root.left);
			}
			if (root.right != null) {
				rangeSumBSTDFS(root.right);
			}
		//剪枝，从1ms降到0ms	
		}else if(root.val<valueL){   
			if (root.right != null) {
				rangeSumBSTDFS(root.right);
			}
		}else if( root.val > valueR) {
			if (root.left != null) {
				rangeSumBSTDFS(root.left);
			}
		}
		
	}

}
