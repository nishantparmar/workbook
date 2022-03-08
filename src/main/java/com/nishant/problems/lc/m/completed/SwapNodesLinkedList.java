package com.nishant.problems.lc.m.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
//COMPLETED
public class SwapNodesLinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        int size = length(head);

        //reach to first node
        ListNode firstNode = head;
        for (int i = 1; i != k; i++) {
            firstNode = firstNode.next;
        }

        //reach to second node
        ListNode lastNode = head;
        for (int j = 1; j < size - k + 1; j++) {
            lastNode = lastNode.next;
        }

        //swap the value
        int temp = firstNode.val;
        firstNode.val = lastNode.val;
        lastNode.val = temp;

        return head;
    }

    private int length(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(9);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(7);

        SwapNodesLinkedList sp1 = new SwapNodesLinkedList();
        Utilities.printListNode(sp1.swapNodes(head, 2));
    }
}
