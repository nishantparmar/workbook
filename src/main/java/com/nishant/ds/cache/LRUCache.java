package com.nishant.ds.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private Map<String, Node> map;
    private int capacity;

    private Node head = null;
    private Node tail = null;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
    }

    public String get(String key){
        if(!map.containsKey(key)) return null;

        Node node = map.get(key);

        //deleteFromList(node);
        //setListHead(node);

        return node.getValue();

    }

    public void put(String key, String value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.setValue(value);

            //deleteFromList(node);
            //setListHead(node);

        } else{
            if(map.size() > capacity){
                map.remove(tail.getKey());
                //deleteFromList(tail);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            //setListHead(node);
        }

    }
}
