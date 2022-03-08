package com.nishant.problems.lc.m.completed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/lru-cache/
//COMPLETED
public class LRUCache {

    //Doubly Linked List Node
    class Node {
        int key;
        int value;

        private Node next;
        private Node prev;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map;
    private int capacity;

    private Node head = null;
    private Node tail = null;
    int count;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        count = 0;
    }

    public int get(int key) {
        if (map.get(key) != null) {
            Node node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addToHead(node);
            return result;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.get(key) != null) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        } else {
            Node node = new Node(key, value);
            map.put(key, node);
            if (count < capacity) {
                count++;
                addToHead(node);
            } else {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }

    public void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(Node node) {
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 100);
        lru.put(2, 200);
        System.out.println(lru.get(2));
        lru.put(3, 300);
        System.out.println(lru.get(1));

    }

    //https://leetcode.com/problems/zigzag-iterator/
    //COMPLETED
    public static class ZigzagIterator {

        List<Integer> l1;
        List<Integer> l2;
        List<Integer> resultList = new ArrayList<>();
        int index = 0;

        public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
            this.l1 = v1;
            this.l2 = v2;
        }

        boolean left = true;
        boolean right = true;

        public int next() {
            if (l1.size() > 0 && left) {
                left = false;
                resultList.add(l1.get(0));
                index++;
                l1.remove(0);
                if (l2.size() > 0) right = true;
                return resultList.get(index - 1);
            } else if (l2.size() > 0 && right) {
                right = false;
                resultList.add(l2.get(0));
                index++;
                l2.remove(0);
                if (l1.size() > 0) left = true;
                return resultList.get(index - 1);
            }

            if(l2.size() > 0 && l1.size() ==0){
                resultList.add(l2.get(0));
                l2.remove(0);
                index++;
                return resultList.get(index - 1);
            }else if(l1.size() > 0 && l2.size() == 0){
                resultList.add(l1.get(0));
                l1.remove(0);
                index++;
                return resultList.get(index - 1);
            }

            return -1;
        }

        public boolean hasNext() {
            if (l1.size() > 0 || l2.size() > 0) {
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            List<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);

            List<Integer> l2 = new ArrayList<>();
            l2.add(3);
            l2.add(4);
            l2.add(5);
            l2.add(6);

            ZigzagIterator iterator = new ZigzagIterator(l1, l2);

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }
    }
}

