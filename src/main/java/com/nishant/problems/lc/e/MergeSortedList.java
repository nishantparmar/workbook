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

    //recursive method
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

//    public static LL merge(LL first, LL second) {
//        Node f = first.head;
//        Node s = second.head;
//
//        LL ans = new LL();
//
//        while (f != null && s != null) {
//            if (f.value < s.value) {
//                ans.insertLast(f.value);
//                f = f.next;
//            } else {
//                ans.insertLast(s.value);
//                s = s.next;
//            }
//        }
//
//        while (f != null) {
//            ans.insertLast(f.value);
//            f = f.next;
//        }
//
//        while (s != null) {
//            ans.insertLast(s.value);
//            s = s.next;
//        }
//
//        return ans;
//    }
}
