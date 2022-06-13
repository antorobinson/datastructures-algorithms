package com.anto.dsa.linkedlist;

/**
 * 
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ListNode linkedList = ListNode.createLinkedList(arr);

		ListNode output = reverseKGroup(linkedList, 3);

		if (output != null)
			output.print();

	}

	public static ListNode reverseKGroup(ListNode head, int k) {

		ListNode dummy = new ListNode();
		dummy.next = head;

		ListNode pre = dummy;
		ListNode cur = head;
		ListNode nex;

		int count = 0;
		while (cur != null) {
			if (++count == k) {
				count = 0;
				nex = cur.next;
				cur = pre.next;
				ListNode nextNode = cur;
				for (int i = 0; i < k; i++) {
					ListNode nextN = nextNode.next;
					nextNode.next = nex;
					nex = nextNode;
					pre.next = nex;
					nextNode = nextN;
				}
				pre = cur;
			}
			cur = cur.next;
		}
		return dummy.next;
	}

}