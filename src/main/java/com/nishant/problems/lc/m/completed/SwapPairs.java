package com.nishant.problems.lc.m.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/swap-nodes-in-pairs/
//COMPLETED
class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        ListNode first = head;
        ListNode second = head.next;

        while (true) {
            if (first != null && second != null) {
                int temp = second.val;
                second.val = first.val;
                first.val = temp;

                first = first.next.next;
                if (second.next != null) {
                    second = second.next.next;
                } else {
                    second = null;
                }
            } else {
                break;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        SwapPairs sp = new SwapPairs();
        Utilities.printListNode(sp.swapPairs(head));
    }
}