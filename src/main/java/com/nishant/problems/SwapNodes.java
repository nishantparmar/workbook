package com.nishant.problems;

import com.nishant.ListNode;
import com.nishant.Utilities;

public class SwapNodes {

    //1 --> 2 --> 3 --> 4 --> 5
    //1 --> 4 --> 3 --> 2 --> 5
    public ListNode swapNode(ListNode head, int first, int second) {

        ListNode firstNode = head;
        ListNode secondNode = head;

        ListNode firstNodePrev = null;
        ListNode secondNodePrev = null;

        // Search for firstNode
        while (firstNode != null && firstNode.val != first) {
            firstNodePrev = firstNode;
            firstNode = firstNode.next;
        }

        // Search for secondNode
        while (secondNode != null && secondNode.val != second) {
            secondNodePrev = secondNode;
            secondNode = secondNode.next;
        }

        if (firstNode != null && secondNode != null) {

            // If previous node to firstNode is not null then,
            // it will point to secondNode
            if (firstNodePrev != null)
                firstNodePrev.next = secondNode;
            else
                head = secondNode;

            // If previous node to secondNode is not null then,
            // it will point to node1
            if (secondNodePrev != null)
                secondNodePrev.next = firstNode;
            else
                head = firstNode;

            // Swaps the next nodes of firstNode and secondNode
            ListNode temp = firstNode.next;
            firstNode.next = secondNode.next;
            secondNode.next = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        SwapNodes sp = new SwapNodes();
        Utilities.printListNode(sp.swapNode(head, 2, 4));
    }


}
