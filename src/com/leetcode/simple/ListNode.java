package com.leetcode.simple;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
	public static void printList(ListNode head) {
		ListNode cur = head;
		while(cur!=null) {
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
		System.out.println();
	}
}
