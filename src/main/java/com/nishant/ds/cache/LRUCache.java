package com.nishant.ds.cache;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/lru-cache/
public class LRUCache {

    class Node {
        private String key;
        private String value;

        private Node next;
        private Node prev;

        public Node() {
        }

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<String, Node> map;
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

    public String get(String key) {
        if (map.get(key) != null) {
            Node node = map.get(key);
            String result = node.value;
            deleteNode(node);
            addToHead(node);
            return result;
        }
        return "";
    }

    public void put(String key, String value) {
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

    private void deleteNode(Node node) {
    }

    private void addToHead(Node node) {
    }


}
