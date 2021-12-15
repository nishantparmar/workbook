package com.nishant.ds.linkedlist;

public class NodeList {
    Node root;

    public NodeList(Node first) {
        this.root = first;
    }

    public void addFirst(Node first) {
        first.next = root;
        root = first;
    }

    public void addLast(Node last) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = last;
                last.next = null;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void deleteFirst() {
        Node first = root;
        Node second = root.next;
        root = second;
        first = null;
    }

    public void deleteLast() {
        Node currentNode = root;
        Node previousNode = null;
        while (true) {
            if (currentNode.next == null) {
                previousNode.next = null;
                currentNode = null;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public boolean contains(Node node) {
        return indexOf(node) == 0;
    }

    public int indexOf(Node node) {
        Node currentNode = root;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.value == node.value) {
                return index;
            }
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public int size() {
        if (root == null) return 0;
        Node currentNode = root;
        int index = 0;
        while (currentNode != null) {
            index++;
            currentNode = currentNode.next;
        }
        return index;
    }

    //TODO
    public void reverse(){
        //100 --> 200 --> 300
        //100 <-- 200 --> 300

        Node currentNode = root;
        Node previousNode = null;
        while (currentNode != null) {

            currentNode.next.next = currentNode;

            currentNode = currentNode.next;
        }
    }
}
