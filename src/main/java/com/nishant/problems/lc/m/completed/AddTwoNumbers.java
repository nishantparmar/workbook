package com.nishant.problems.lc.m.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/add-two-numbers/
//COMPLETED
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode l3 = null;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        int remainder = 0;
        while (currentL1 != null && currentL2 != null) {
            int sum = remainder + currentL1.val + currentL2.val;
            remainder = 0;
            int l3Val = 0;
            if (sum > 9) {
                remainder = 1;
                l3Val = sum % 10;
            } else {
                l3Val = sum;
            }
            if (l3 == null) {
                l3 = new ListNode(l3Val);
            } else {
                insert(l3, l3Val);
            }
            currentL1 = currentL1.next;
            currentL2 = currentL2.next;
        }

        if (currentL2 == null && currentL1 != null) {
            while (currentL1 != null) {
                if (l3 == null) {
                    l3 = new ListNode(currentL1.val);
                } else {
                    int val = currentL1.val + remainder;
                    if (val > 9) {
                        val = val % 10;
                        remainder = 1;
                    } else {
                        remainder = 0;
                    }
                    insert(l3, val);
                }
                currentL1 = currentL1.next;
            }
        }

        if (currentL1 == null && currentL2 != null) {
            while (currentL2 != null) {
                if (l3 == null) {
                    l3 = new ListNode(currentL2.val);
                } else {
                    int val = currentL2.val + remainder;
                    if (val > 9) {
                        remainder = 1;
                        val = val % 10;
                    } else {
                        remainder = 0;
                    }
                    insert(l3, val);

                }
                currentL2 = currentL2.next;
            }
        }

        if (currentL1 == null && currentL2 == null && remainder != 0) {
            insert(l3, remainder);
        }

        return l3;
    }

    ListNode insert(ListNode root, int item) {
        ListNode temp = new ListNode();
        ListNode ptr;
        temp.val = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode l1;
        ListNode l2;

        l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(7);
        l2.next.next.next = new ListNode(9);

        AddTwoNumbers atn = new AddTwoNumbers();
        Utilities.printListNode(atn.addTwoNumbers(l1, l2));
    }
}
