package com.nishant.problems.lc.h;

import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/design-file-system/
public class InMemoryFileSystem {

    class TrieNode {
        String content;
        HashMap<String, TrieNode> childNode = new HashMap<>();
    }

    class FileSystem {
        TrieNode root = new TrieNode();

        public FileSystem() {
        }

        public List<String> ls(String path) {
            TrieNode currentNode = root;
            if (!"/".equals(path)) {
                String[] directories = path.split("/");


            }

            return null;
        }

        public void mkdir(String path) {

        }

        public void addContentToFile(String filePath, String content) {

        }

        public String readContentFromFile(String filePath) {

            return "";
        }


    }

    public static void main(String[] args) {

    }
}
