package com.nishant.problems.lc.m;

import com.nishant.ListNode;

//https://leetcode.com/problems/linked-list-random-node/
//MEDIUM
//COMPLETED
public class LinkedListRandomNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        LinkedListRandomNode rn = new LinkedListRandomNode(head);
        System.out.print(rn.getRandom() + " , ");
        System.out.print(rn.getRandom() + " , ");
        System.out.print(rn.getRandom() + " , ");
        System.out.print(rn.getRandom() + " , ");
        System.out.print(rn.getRandom() + " , ");
        System.out.print(rn.getRandom());
    }

    ListNode head;
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        ListNode currentNode= head;
        int rnd = (int)(Math.random()* (size()));
        int index = 0;
        while(currentNode.next != null){
            if(index == rnd){
                return currentNode.val;
            }
            index++;
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    public int size() {
        if (head == null) return 0;
        ListNode currentNode = head;
        int index = 0;
        while (currentNode != null) {
            index++;
            currentNode = currentNode.next;
        }
        return index;
    }
}
