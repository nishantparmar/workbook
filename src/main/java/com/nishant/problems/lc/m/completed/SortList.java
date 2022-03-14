package com.nishant.problems.lc.m.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/sort-list/
//COMPLETED  - Bubble Sort pending
public class SortList {

    //Merge Sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = getMid(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left, right);
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

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            if (midPrev == null) {
                midPrev = head;
            } else {
                midPrev = midPrev.next;
            }
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public ListNode sort(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        if (first.val > second.val) {
            if (first == head) { //first is head
                head = second;
                first.next = second.next;
                second.next = first;
            } else if (second.next == null) {//second is tail

            } else { //middle nodes

            }

            // swap
            head = second;
            first.next = second.next;
            second.next = first;
        }
        head = head.next;
        return sort(head);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        Utilities.printListNode(head);

        SortList l = new SortList();

        Utilities.printListNode(l.sort(head));


    }

}
