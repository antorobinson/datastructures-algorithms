package com.anto.dsa.linkedlist;

/**
 * @author Sahaya Anto Robinson
 * 
 * 
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 *
 */
public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ListNode linkedList = ListNode.createLinkedList(arr);

		ListNode output = removeNthFromEnd(linkedList, 5);

		if (output != null)
			output.print();
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode start = new ListNode();
		start.next = head;

		ListNode slow = start;
		ListNode fast = start;

		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next;

		return start.next;
	}
}
