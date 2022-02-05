package com.nishant.problems.lc.e;

import com.nishant.ListNode;
//https://leetcode.com/problems/palindrome-linked-list/
//COMPLETED
class PalindromLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;

        ListNode firstHalfEnd = findMiddle(head);
        ListNode secondHaflStart = reverseList(firstHalfEnd);

        ListNode currentNode1 = head;
        ListNode currentNode2 = secondHaflStart;
        boolean result = true;
        while (currentNode2 != null && currentNode1 != null) {
            if (currentNode1.val != currentNode2.val) {
                result = false;
            }
            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
        }
        return result;
    }

    ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous = head;
        ListNode current = head.next;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        if (current == null) {
            current = head;
            current.next = null;
            head = previous;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(1);
        PalindromLinkedList pll = new PalindromLinkedList();
        System.out.println(pll.isPalindrome(head));
    }
}