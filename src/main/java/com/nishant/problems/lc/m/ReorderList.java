package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/reorder-list/
public class ReorderList {
    public void reorderList(ListNode head) {
        int mid = findMiddle(head);

        ListNode current = head;
        while (current.next != null){

        }


    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode previous = head;
        ListNode current = head.next;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        if (current == null) {
            current = head;
            current.next = null;
            head = previous;
        }
        return head;
    }

    private int findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int index = 0;
        while (slow.next != null && fast != null && fast.next != null) {
            index++;
            slow = slow.next;
            if (fast.next == null) break;
            fast = fast.next.next;
        }
        return index;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Utilities.printListNode(head);
        ReorderList rl = new ReorderList();
        rl.reorderList(head);
        Utilities.printListNode(head);
    }
}
