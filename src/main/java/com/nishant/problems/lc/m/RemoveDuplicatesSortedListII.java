package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

import java.math.BigInteger;
import java.util.*;

public class RemoveDuplicatesSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode();
        Map<Integer, Integer> map = new HashMap<>();
        ListNode current = head;
        ListNode previous = null;
        do {
            if (map.containsKey(current.val)) {
                map.put(current.val, map.get(current.val) + 1);
            } else {
                map.put(current.val, 1);
            }
            current = current.next;
        } while (current == null);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > 1) {

            } else {
                if (result == null) {
                    result = new ListNode(value);
                } else {
                    result.next = new ListNode(value);
                }
                result = result.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(5);

        RemoveDuplicatesSortedListII rd = new RemoveDuplicatesSortedListII();
        Utilities.printListNode(rd.deleteDuplicates(head));

    }
}
