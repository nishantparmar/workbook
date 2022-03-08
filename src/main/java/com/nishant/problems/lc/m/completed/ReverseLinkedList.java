package com.nishant.problems.lc.m.completed;

import com.nishant.ListNode;
import com.nishant.Utilities;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-linked-list/
//COMPLETED
public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {
        return reverseRec(head);
    }

    private ListNode reverseRec(ListNode curr) {
        if (curr == null) {
            return null;
        } else if (curr.next == null) {
            return curr;
        } else {
            ListNode nextNode = curr.next;
            curr.next = null;
            ListNode rest = reverseRec(nextNode);
            nextNode.next = curr;
            return rest;
        }
    }

    public ListNode reverseList(ListNode head) {
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
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Utilities.printListNode(head);
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode aNode1 = rll.reverseList(head);
        Utilities.printListNode(aNode1);
        ListNode aNode2 = rll.reverse(aNode1);
        Utilities.printListNode(aNode2);

    }

    //https://leetcode.com/problems/destroying-asteroids/
    //MEDIUM
    //COMPLETED
    public static class DestroyingAsteroids {

        public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
            if (asteroids.length == 1) {
                if (mass >= asteroids[0]) {
                    return true;
                } else {
                    return false;
                }
            }
            Arrays.sort(asteroids);
            long newPlanetMass = mass;
            boolean isDestroyed = true;
            for (int i = 0; i < asteroids.length; i++) {
                if (asteroids[i] > newPlanetMass) {
                    return false;
                } else {
                    if (newPlanetMass < 100000) {
                        newPlanetMass = newPlanetMass + asteroids[i];
                    }else{
                        return  true;
                    }
                    isDestroyed = true;
                }
            }
            return isDestroyed;
        }

        public static void main(String[] args) {
            int[] asteroids4 = {97};
            System.out.println(asteroidsDestroyed(5, asteroids4));

            int mass = 5;
            int[] asteroids1 = {4, 9, 23, 4};
            System.out.println(asteroidsDestroyed(5, asteroids1));

            int[] asteroids2 = {3, 9, 19, 5, 21};
            System.out.println(asteroidsDestroyed(10, asteroids2));

            int[] asteroids3 = {1, 1};
            System.out.println(asteroidsDestroyed(2, asteroids3));

        }

    }
}
