package com.nishant.problems.lc.e.completed;

import java.util.HashMap;

//https://leetcode.com/problems/first-unique-character-in-a-string/
//COMPLETED
public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (counter.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueChar fc = new FirstUniqueChar();
        System.out.println(fc.firstUniqChar("aadadaad"));
    }
}
