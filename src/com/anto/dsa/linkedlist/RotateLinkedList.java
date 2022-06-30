package com.anto.dsa.linkedlist;

/**
 * see <a href=
 * "https://leetcode.com/problems/reverse-linked-list/">reverse-linked-list<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class RotateLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ListNode linkedList = ListNode.createLinkedList(arr);

		ListNode output = rotateList(linkedList, 3);

		if (output != null)
			output.print();

	}

	public static ListNode rotateList(ListNode head, int k) {

		if (head == null || head.next == null || k == 0)
			return head;

		int length = 1;
		ListNode curr = head;

		while (curr.next != null) {
			curr = curr.next;
			length++;
		}

		curr.next = head;
		k = length - k % length;

		while (k-- > 0) {
			curr = curr.next;
		}

		head = curr.next;
		curr.next = null;
		return head;

	}

}