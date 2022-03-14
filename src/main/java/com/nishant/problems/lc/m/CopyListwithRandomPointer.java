package com.nishant.problems.lc.m;

//https://leetcode.com/problems/copy-list-with-random-pointer/
public class CopyListwithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        Node newHead = new Node(head.val);

        return null;
    }

}
