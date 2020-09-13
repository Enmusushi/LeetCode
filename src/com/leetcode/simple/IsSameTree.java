package com.leetcode.simple;

/**
 * 100. 相同的树
 * @author enmu
 *
 */
public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==q) {
			return true;
		}else if(p==null||q==null) {//防止空指针异常
			return false;
		}
		else if(p.val==q.val){ //只有当前值节点值相等，才有继续判断的必要
			return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
		}
		return false;
	}
	
	public static void main(String[] args) {
		TreeNode node1= new TreeNode(1);
		TreeNode node2= new TreeNode(2);
		TreeNode node3= new TreeNode(3);
		node1.left= node2;
		node1.right= node3;
		IsSameTree test = new IsSameTree();
		System.out.println(test.isSameTree(node1, node1));
		System.out.println(test.isSameTree(node1, node2));
	}
}
