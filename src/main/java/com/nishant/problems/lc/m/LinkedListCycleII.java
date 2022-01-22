package com.nishant.problems.lc.m;

import com.nishant.ListNode;

//https://leetcode.com/problems/linked-list-cycle-ii/
//PENDING
public class LinkedListCycleII {

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(5);

        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        int length = linkedListCycleII.calculateCycleLength(head);

        System.out.println(length);

    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode startCycle = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                startCycle = slow;
            }
        }
        return head;
    }

    public int calculateCycleLength(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            length++;
            if (slow == fast) {
                break;
            }
        }
        return length;
    }

}
