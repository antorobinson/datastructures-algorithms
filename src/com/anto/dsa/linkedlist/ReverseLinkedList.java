package com.anto.dsa.linkedlist;

/**
 * see <a href=
 * "https://leetcode.com/problems/reverse-linked-list/">reverse-linked-list<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ListNode linkedList = ListNode.createLinkedList(arr);

		ListNode output = reverseList(linkedList);

		if (output != null)
			output.print();

	}

	public static ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}