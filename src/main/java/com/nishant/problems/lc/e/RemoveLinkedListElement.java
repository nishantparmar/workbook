package com.nishant.problems.lc.e;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/remove-linked-list-elements/
//COMPLETED
public class RemoveLinkedListElement {

    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        head.next = new ListNode(5);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original ListNode ");
        Utilities.printListNode(head);

        RemoveLinkedListElement remDup = new RemoveLinkedListElement();
        ListNode result = remDup.removeElements(head, 6);
        System.out.println("Updated ListNode");
        Utilities.printListNode(result);
    }

    public ListNode removeElements(ListNode head, int val) {
        // Store head node
        ListNode current = head;
        ListNode previous = null;

        while (current != null && current.val == val) {
            head = current.next; // Changed head
            current = head; // Change current
        }

        // Delete occurrences other than head
        while (current != null) {
            while (current != null && current.val != val) {
                previous = current;
                current = current.next;
            }

            // If key was not present in linked list
            if (current == null)
                return head;

            // Unlink the node from linked list
            previous.next = current.next;

            // Update current for next iteration of outer loop
            current = previous.next;
        }
        return head;
    }

}
