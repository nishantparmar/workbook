package com.nishant.problems.lc.h;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/merge-k-sorted-lists/
//COMPLETED - Check performance
public class MergeKSortedLists {
    //    Runtime: 615 ms, faster than 5.03% of Java online submissions for Merge k Sorted Lists.
    //    Memory Usage: 46.8 MB, less than 31.07% of Java online submissions for Merge k Sorted Lists.
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }

        if (lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }
        ListNode merged = lists[0];
        for (int i = 1; i < lists.length; i++) {
            merged = mergeTwoLists(merged, lists[i]);
        }
        return merged;
    }

    private ListNode mergeTwoLists(ListNode firstList, ListNode secondList) {
        ListNode mergedList = null;

        if (firstList == null) return secondList;
        if (secondList == null) return firstList;

        if (firstList.val <= secondList.val) {
            mergedList = firstList;
            mergedList.next = mergeTwoLists(firstList.next, secondList);
        } else {
            mergedList = secondList;
            mergedList.next = mergeTwoLists(firstList, secondList.next);
        }
        return mergedList;
    }

    public static void main(String[] args) {
        MergeKSortedLists msl = new MergeKSortedLists();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);

        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        Utilities.printListNode(msl.mergeKLists(lists));
    }
}
