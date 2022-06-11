package com.anto.dsa.linkedlist;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public void print() {
		System.out.print("["+val);
		while (next != null) {
			System.out.print(", " + next.val);
			next = next.next;
		}
		System.out.print("]");
	}
	
	public static ListNode createLinkedList(int[] arr) {
		ListNode node = new ListNode();
		ListNode nextNode = node;

		for (int i : arr) {
			nextNode.next = new ListNode(i);
			nextNode = nextNode.next;
		}
		return node.next;
	}
}
