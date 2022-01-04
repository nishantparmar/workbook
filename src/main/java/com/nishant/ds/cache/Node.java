package com.nishant.ds.cache;

public class Node {
    private String key;
    private String value;

    private Node next;
    private Node prev;

    public Node(String key, String value){
        this.key=key;
        this.value=value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}