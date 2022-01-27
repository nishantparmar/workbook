package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/reverse-linked-list/
//COMPLETED
public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {
        return reverseRec(head);
    }

    private ListNode reverseRec(ListNode curr) {
        if (curr == null) {
            return null;
        } else if (curr.next == null) {
            return curr;
        } else {
            ListNode nextNode = curr.next;
            curr.next = null;
            ListNode rest = reverseRec(nextNode);
            nextNode.next = curr;
            return rest;
        }
    }

    public ListNode reverseList(ListNode head) {
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

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Utilities.printListNode(head);
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode aNode1 = rll.reverseList(head);
        Utilities.printListNode(aNode1);
        ListNode aNode2 = rll.reverse(aNode1);
        Utilities.printListNode(aNode2);

    }

}
