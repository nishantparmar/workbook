package com.nishant.problems.lc.m;

//https://leetcode.com/problems/design-linked-list/
//MEDIUM
//In Progress
public class MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList mll1 = new MyLinkedList(new ListNode());
        mll1.addAtHead(7);
        mll1.addAtHead(2);
        mll1.addAtHead(1);
        mll1.addAtIndex(3, 0);
        mll1.deleteAtIndex(2);
        mll1.addAtHead(6);
        mll1.addAtTail(4);
        System.out.println(mll1.get(4));//6->1->2->4
        mll1.addAtHead(4);
        mll1.addAtIndex(5, 0);
        mll1.addAtHead(6);
    }

    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

    }

    ListNode head;

    public MyLinkedList(ListNode head) {
        this.head = head;
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        if (head.value > 1000) {
            return -1;
        }
        int i = 0;
        ListNode currentNode = head;
        while (i <= index) {
            if (i == index) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
            if (currentNode == null) {
                break;
            }
            i++;
        }
        return -1;

    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode();
        newHead.value = val;
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        ListNode newTail = new ListNode();
        newTail.value = val;

        if (head.next == null) {
            head.next = newTail;
            return;
        }

        ListNode currentNode = head;
        while (head.next != null) {
            if (currentNode.next == null) {
                currentNode.next = newTail;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void addAtIndex(int index, int val) {
        ListNode aNode = new ListNode();
        aNode.value = val;

        if (index == 0) {
            aNode.next = head;
            head = aNode;
            return;
        }

        if (head.next == null) {
            head.next = aNode;
        }

        ListNode currentNode = head;
        ListNode prevNode = null;
        int i = 0;
        while (currentNode != null) {
            if (i == index) {
                aNode.next = currentNode;
                prevNode.next = aNode;
                currentNode = aNode;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }

        ListNode currentNode = head;
        ListNode prevNode = null;
        int i = 0;
        while (currentNode != null) {
            if (i == 0) {

            }
            if (i == index) {
                prevNode.next = currentNode.next;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }

    }

    public void print(ListNode head) {
        ListNode current = head;
        System.out.println(current.value + "->");
        while (current.next != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("--------");
    }

    public static void main1(String[] args) {


//        ListNode head = new ListNode(3);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(6);
//        head.next.next = new ListNode(6);
//        head.next.next.next = new ListNode(8);
//        head.next.next.next.next = new ListNode(10);
//
//        MyLinkedList mll = new MyLinkedList(head);
//        mll.addAtHead(2);
//        mll.addAtTail(12);
//        System.out.println(mll.get(0));
//        System.out.println(mll.get(6));
//        mll.addAtIndex(3, 7);
//        System.out.println(mll.get(3) + " - " + mll.get(2) + " - " + mll.get(4));
//
//        System.out.println(mll.get(3));
//        mll.deleteAtIndex(3);
//        System.out.println(mll.get(3));

    }
}
