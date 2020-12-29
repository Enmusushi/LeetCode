package com.leetcodde.middle;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode p = headA;
		ListNode q = headB;
		if (p == null || q == null) {
			return null;
		}
		boolean isA = true;
		boolean isB = true;
		while (p != q) {
			if (p.next == null && isA) {
				p = headB;
				isA = false;
			} else {
				p = p.next;
			}
			if (q.next == null && isB) {
				q = headA;
				isB = false;
			} else {
				q = q.next;
			}

		}
		return p;
	}
}
