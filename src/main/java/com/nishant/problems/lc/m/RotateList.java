package com.nishant.problems.lc.m;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/rotate-list/
//COMPLETED
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if (k <= 0 || head == null || head.next == null)
            return head;

        //reach to last node and calculate length
        ListNode lastNode = head;
        int length = 1;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            length++;
        }
        //attach last node to head
        lastNode.next = head;

        //calculate rotations
        int rotations = k % length;

        //find new last based on k
        int skip = length - rotations;

        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        //attach new last node based on k to head
        head = newLast.next;
        newLast.next = null;
        return head;
    }


    int size(ListNode head) {
        int index = 0;
        ListNode current = head.next;
        while (current != null) {
            current = current.next;
            index++;
        }
        return index + 1;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Utilities.printListNode(head);
        RotateList rl = new RotateList();
        Utilities.printListNode(rl.rotateRight(head, 2));
    }

}
