package com.nishant.problems.lc.m.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/split-linked-list-in-parts/
public class SplitLinkedList {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];

        if (head == null) return result;

        //calculate length and create list
        int length = 1;
        ListNode current = head;
        while (current != null && current.next != null) {
            current = current.next;
            length++;
        }

        int splitSize = length / k; //each split
        int remaining = length % k; // after each remaining

        int windowStart = 0;
        int windowEnd = windowStart + (remaining - 1);
        int index = 0;

        ListNode curr = head;
        ListNode prev = null;
        while (windowEnd < length && index < k) {
            result[index] = curr;
            for (int j = 0; j < splitSize + (remaining > 0 ? 1 : 0); j++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            index++;
            remaining--;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
        Utilities.printListNode(head);
        SplitLinkedList sll = new SplitLinkedList();
        ListNode[] resultArray = sll.splitListToParts(head, 3);
        for (int i = 0; i < resultArray.length; i++) {
            Utilities.printListNode(resultArray[i]);
        }
    }
}
