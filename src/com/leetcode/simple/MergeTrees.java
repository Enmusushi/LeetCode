package com.leetcode.simple;
/**
 * 617. 合并二叉树
 * @author enmusushi
 * 未完成
 */
public class MergeTrees {
	private TreeNode ans =null;
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	mergeTreesDFS(ans,t1,t2);
    	return ans;

    }
	public TreeNode mergeTreesDFS(TreeNode ans,TreeNode t1,TreeNode t2) {
		if(t1!=null&&t2!=null) {
			ans = new TreeNode(t1.val+t2.val);
			System.out.println(ans);
			ans.left =mergeTreesDFS(ans.left,t1.left,t2.left);
			ans.right= mergeTreesDFS(ans.right,t1.right,t2.right);
		}else if(t1!=null) {
			ans = new TreeNode(t1.val);
			System.out.println(ans);
			ans.left =mergeTreesDFS(ans.left,t1.left,null);
			mergeTreesDFS(ans.right,t1.right,null);
		}else if(t2!=null) {
			ans = new TreeNode(t2.val);
			System.out.println(ans);
			ans.left =mergeTreesDFS(ans.left,null,t2.left);
			ans.right= mergeTreesDFS(ans.right,null,t2.right);
		}
		return ans;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);
		MergeTrees test = new MergeTrees();
		System.out.println(test.mergeTrees(t1, t2));
		
	}
}
