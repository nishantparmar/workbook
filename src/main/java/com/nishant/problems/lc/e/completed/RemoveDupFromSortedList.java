package com.nishant.problems.lc.e.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//COMPLETED
public class RemoveDupFromSortedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);

        System.out.println("Original ListNode ");
        Utilities.printListNode(head);

        RemoveDupFromSortedList remDup = new RemoveDupFromSortedList();
        ListNode result = remDup.deleteDuplicates(head);
        System.out.println("Updated ListNode");
        Utilities.printListNode(result);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                    current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
