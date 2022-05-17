package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int index = words.length - 1;
        while (index >= 0) {
            if (words[index] != "") {
                sb.append(words[index]);
                sb.append(" ");
            }
            index--;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInString rws = new ReverseWordsInString();
        System.out.println(rws.reverseWords("example   good a"));
    }

}
