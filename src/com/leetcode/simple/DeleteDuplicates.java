package com.leetcode.simple;

/**
 * 83. 删除排序链表中的重复元素
 * 
 * @author enmu
 *
 */
public class DeleteDuplicates {

	// 0ms 100%
	public ListNode deleteDuplicates(ListNode head) {
		ListNode pre = head;
		ListNode cur = head == null ? head : head.next;
		while (cur != null) {
			if (pre.val == cur.val) {
				cur = cur.next;
			} else {
				pre.next = cur;
				pre = cur;
				cur = cur.next;
			}
		}
		if (pre != null) {
			pre.next = null;
		}
		return head;
	}
	//递归 1ms 74.18%
	public ListNode deleteDuplicatesDFS(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		head.next = deleteDuplicatesDFS(head.next);
		if(head.val==head.next.val) {
			return head.next;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		DeleteDuplicates test = new DeleteDuplicates();
		ListNode.printList(node1);
		ListNode.printList(test.deleteDuplicatesDFS(node1));

	}
}
