package com.nishant.problems.lc.e;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/merge-two-sorted-lists/
//COMPLETED
public class MergeSortedList {

    public static void main(String[] args) {
        ListNode fisrtList = new ListNode(1);
        fisrtList.next = new ListNode(2);
        fisrtList.next.next = new ListNode(4);

        ListNode secondList = new ListNode(1);
        secondList.next = new ListNode(3);
        secondList.next.next = new ListNode(4);
        MergeSortedList msl = new MergeSortedList();
        ListNode mergedList = msl.mergeTwoLists(fisrtList,secondList);

        Utilities.printListNode(mergedList);

    }


    public ListNode mergeTwoLists(ListNode firstList, ListNode secondList) {
        ListNode mergedList = null;

        if (firstList == null) {
            return secondList;
        }

        if (secondList == null) {
            return firstList;
        }

        if (firstList.val <= secondList.val) {
            mergedList = firstList;
            mergedList.next = mergeTwoLists(firstList.next, secondList);
        } else {
            mergedList = secondList;
            mergedList.next = mergeTwoLists(firstList, secondList.next);
        }
        return mergedList;
    }
}
