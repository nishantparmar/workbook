package com.nishant.problems.lc.m;

import com.nishant.TrieNode;

public class AddSearchWords {
    static class WordDictionary {
        TrieNode root;
        public WordDictionary() {
            root = new TrieNode('\0');
        }

        public void addWord(String word) {
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

        private TrieNode getNode(String word){
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (current.children[ch - 'a'] == null) return null;
                current = current.children[ch - 'a'];
            }
            return current;
        }
    }

    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");

       // System.out.println(dictionary.search("pad"));
      //  System.out.println(dictionary.search("bad"));
        System.out.println(dictionary.search(".ad"));
        System.out.println(dictionary.search("b.."));

    }
}
