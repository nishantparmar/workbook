package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//COMPLETED
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        if (size == 0) {
            return head;
        }
        if (size == 1 && n == 1) {
            return null;
        }
        int k = size - n;

        if (k == 0) {
            return deleteFirst(head);
        } else if (k == size-1) {
            return deleteLast(head);
        }

        if (head == null) {
            return null;
        } else {
            return removeKthNode(head, k);
        }
    }

    private ListNode deleteFirst(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        head = second;
        first = null;
        return head;
    }

    private ListNode deleteLast(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;
        while (true) {
            if (currentNode.next == null) {
                previousNode.next = null;
                currentNode = null;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return head;
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

    private int size(ListNode head) {
        int index = 1;
        ListNode current = head;
        while (current.next != null) {
            index++;
            current = current.next;
        }
        return index;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next = new ListNode(5);
        RemoveNthFromEnd rem = new RemoveNthFromEnd();

//        System.out.println(rem.size(head));

        Utilities.printListNode(head);

        head = rem.removeNthFromEnd(head, 1);
//        System.out.println(rem.size(head));

        Utilities.printListNode(head);
    }
}
