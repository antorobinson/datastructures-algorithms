package com.anto.dsa.linkedlist;

/**
 * @author Sahaya Anto Robinson
 * 
 * 
 * https://leetcode.com/problems/middle-of-the-linked-list/submissions/
 *
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		int[] arr1 = { 1,2,4 };
		int[] arr2 = { 1,3,4 };

		ListNode linkedList1 = ListNode.createLinkedList(arr1);
		ListNode linkedList2 = ListNode.createLinkedList(arr2);

		ListNode output = mergeTwoLists2(linkedList1, linkedList2);

		if (output != null)
			output.print();
	}

	public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {

		ListNode node = new ListNode();

		ListNode result = node;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				ListNode next = list1.next;
				result.next = list1;
				result = result.next;
				list1 = next;
			} else {
				ListNode next = list2.next;
				result.next = list2;
				result = result.next;
				list2 = next;
			}
		}

		while (list1 != null) {
			ListNode next = list1.next;
			result.next = list1;
			result = result.next;
			list1 = next;
		}

		while (list2 != null) {
			ListNode next = list2.next;
			result.next = list2;
			result = result.next;
			list2 = next;
		}
		return node.next;
	}

	public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode first = list1;
		ListNode second = list2;
		
		boolean isList1Isresult = true;

		if (list1.val > list2.val) {
			first = list2;
			second = list1;
			isList1Isresult = false;
		}
		
		ListNode temp = first;

		while (first != null && second != null) {
			if (first.val > second.val) {
				ListNode next = second.next;
				temp.next = second;
				second.next = first;
				temp = second;
				second = next;
			} else {
				temp = first;
				first = first.next;
			}
		}
		
		if(second != null) {
			temp.next = second;
		}

		return isList1Isresult?list1:list2;
	}

}
