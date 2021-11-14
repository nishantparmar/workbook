package com.nishant.trie;

public class Trie {
    public Node root;
    public void insert(String word) {
        if (word == null) return;
        Node current = root;
        int index = 0;
        for (var ch : word.toCharArray()) {
            if (!current.hasChild(ch)) {
                current.addChild(ch);
                current = current.getChild(index);
            }
        }
        current.isEndOfWord = true;
    }

    

}
