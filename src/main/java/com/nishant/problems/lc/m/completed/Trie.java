package com.nishant.problems.lc.m.completed;

import com.nishant.TrieNode;

//https://leetcode.com/problems/implement-trie-prefix-tree/
//COMPLETED - Check other implementation in soln section
public class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode('\0');//empty node
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode(ch);
                current = current.children[ch - 'a'];
            }else {
                if(current.children[ch - 'a'].ch == ch){
                    current = current.children[ch - 'a'];
                }
            }
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = getNode(prefix);
        return node != null;
    }

    private TrieNode getNode(String word){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (current.children[ch - 'a'] == null) return null;
            current = current.children[ch - 'a'];
        }
        return current;
    }

    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
