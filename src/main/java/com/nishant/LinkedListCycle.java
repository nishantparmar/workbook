package com.nishant;

import com.nishant.linkedlist.Node;

import java.util.ArrayList;

public class LinkedListCycle {

    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true; // found the cycle
        }
        return false;

//        var list = new ArrayList<Integer>();
//        Node currentNode = head;
//        while (currentNode != null) {
//            if (currentNode.next == null) {
//                return false;
//            }
//            if(list.contains(currentNode.next.value)){
//                return true;
//            }
//            list.add(currentNode.value);
//            currentNode = currentNode.next;
//        }
//        return false;


    }
}
