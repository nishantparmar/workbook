package com.nishant.problems.lc.e;

import com.nishant.ListNode;
import com.nishant.Utilities;
import com.nishant.problems.lc.m.ReverseLinkedList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        ReverseLinkedList reverse = new ReverseLinkedList();
        ListNode listNode = head;
        ListNode reversedNode = reverse.reverseList(listNode);

        while (head != null && reversedNode != null) {
            if (head.val != reversedNode.val) {
                return false;
            }
            head = head.next;
            reversedNode = reversedNode.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);

        PalindromeLinkedList pll = new PalindromeLinkedList();

        System.out.println(pll.isPalindrome(head));

    }

}
