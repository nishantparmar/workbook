package com.nishant.problems;

import com.nishant.ListNode;
import com.nishant.Utilities;

public class SwapNodes {

    public ListNode swapNode(ListNode head, int first, int second) {

        ListNode current = head;
        ListNode previous = null;

        while (current != null){
            
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
