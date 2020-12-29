package com.leetcode.simple;

/**
 * 160. 相交链表
 * @author admin
 *
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode pA = headA;
		ListNode pB = headB;
		while(pA!=pB) {			
			pA = pA.next==null?headB:pA.next;
			pB = pB.next==null?headA:pB.next;
		}
    	return pA;
    }
}
