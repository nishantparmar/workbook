package com.nishant;

public class TrieNode {
    public char ch;
    public boolean isWord;
    public TrieNode[] children;

    public TrieNode(char ch) {
        this.ch = ch;
        isWord = false;
        children = new TrieNode[26];
    }

    @Override
    public String toString() {
        return ""+ch;
    }
}
