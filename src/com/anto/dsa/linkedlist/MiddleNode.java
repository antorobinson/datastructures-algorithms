package com.anto.dsa.linkedlist;



/**
 * @author Sahaya Anto Robinson
 * 
 * 
 * https://leetcode.com/problems/middle-of-the-linked-list/submissions/
 *
 */
public class MiddleNode {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ListNode linkedList = ListNode.createLinkedList(arr);

		ListNode output = middleNode(linkedList);

		if (output != null)
			output.print();
	}

    public static ListNode middleNode(ListNode head) {
        
        ListNode slow = head, fast=head;
        
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
        
    }
}
