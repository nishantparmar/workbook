package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
//COMPLETED - Consider time and space complexity
public class DeleteMiddleNodeLL {
    //    Runtime: 9 ms, faster than 6.67% of Java online submissions for Delete the Middle Node of a Linked List.
//    Memory Usage: 242.5 MB, less than 5.01% of Java online submissions for Delete the Middle Node of a Linked List.
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            head = null;
            return head;
        } else if (head.next.next == null) {
            head.next = null;
            return head;
        } else {
            int mid = findMiddle(head);
            return removeKthNode(head, mid);
        }
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

    private ListNode removeKthNode(ListNode head, int k) {
        ListNode current = head;
        ListNode previous = null;
        int index = 0;
        while (current.next != null) {
            if (index == k) {
                previous.next = current.next;
                previous = current.next;
                current = current.next;
                index++;
            } else {
                previous = current;
                current = current.next;
                index++;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        DeleteMiddleNodeLL pll = new DeleteMiddleNodeLL();

        Utilities.printListNode(pll.deleteMiddle(head));

    }

}
