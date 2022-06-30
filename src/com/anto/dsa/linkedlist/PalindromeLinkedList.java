package com.anto.dsa.linkedlist;

/**
 * see <a href=
 * https://leetcode.com/problems/palindrome-linked-list/submissions/"
 * >reverse-linked-list<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class PalindromeLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1 };

		ListNode linkedList = ListNode.createLinkedList(arr);

		boolean output = checkPalindromeLinkedList(linkedList);

		System.out.println(output);

	}

	public static boolean checkPalindromeLinkedList(ListNode head) {

		ListNode dummy = head;

		// find the middle node
		ListNode slow = MiddleNode.findMiddleNode(head);

		// reverse list from middle node
		slow = ReverseLinkedList.reverseList(slow);

		// compare value from dummy and middle
		while (slow != null) {
			if (dummy.val != slow.val)
				return false;
			slow = slow.next;
			dummy = dummy.next;
		}

		return true;
	}

}