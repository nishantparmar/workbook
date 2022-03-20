package com.nishant.problems.lc.m.completed;

import java.util.*;

//https://leetcode.com/problems/remove-duplicate-letters/
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] frequency = new int[26];
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        LinkedList<Character> resultList = new LinkedList<>();
        boolean[] isAdded = new boolean[26];
        //Store the last Index of the character.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']--;
            if (isAdded[ch - 'a']) continue;
            while (!resultList.isEmpty() && resultList.getLast() > ch && frequency[resultList.getLast() - 'a'] > 0) {
                isAdded[resultList.removeLast() - 'a'] = false;
            }
            resultList.add(ch);
            isAdded[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!resultList.isEmpty()) sb.append(resultList.removeFirst());
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters rdl = new RemoveDuplicateLetters();
        System.out.println(rdl.removeDuplicateLetters("cbacdcbc"));
    }
}
