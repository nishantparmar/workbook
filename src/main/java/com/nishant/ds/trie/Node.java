package com.nishant.ds.trie;


import java.util.HashMap;

public class Node {
    char value;
    HashMap<Character, Node> childs = new HashMap();
    boolean isEndOfWord = false;

    public Node(char value) {
        this.value = value;
    }

    public void addChild(char ch) {
        childs.put(ch, new Node(ch));
    }

    public boolean hasChild(char ch) {
        return childs.containsKey(ch);
    }

    public Node getChild(int index) {
        return childs.get(index);
    }
}
