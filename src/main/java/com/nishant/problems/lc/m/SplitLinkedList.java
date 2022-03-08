package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

import java.util.ArrayList;
import java.util.List;

public class SplitLinkedList {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        List<Integer> list = new ArrayList<>();
        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            list.add(current.val);
            current = current.next;
            length++;
        }

        int splitSize = length / k;

        int windowStart = 0;
        int windowEnd = windowStart + (splitSize - 1);
        int index = 0;
        while (windowStart <= windowEnd) {
            result[index] = buildLL(list, windowStart, windowEnd);
            windowStart = windowEnd+ splitSize - 1;
            windowEnd = windowStart + (splitSize - 1);
        }

        return result;
    }

    ListNode buildLL(List<Integer> values, int start, int end) {
        ListNode head = new ListNode(values.get(start));
        for (int i = start; i < end-1; i++) {
            head.next = new ListNode(values.get(i));
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        Utilities.printListNode(head);
        SplitLinkedList sll = new SplitLinkedList();
        ListNode[] r = sll.splitListToParts(head, 2);
        for (int i = 0; i < r.length; i++) {
            Utilities.printListNode(r[i]);
        }
    }
}
