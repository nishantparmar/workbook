package com.nishant.problems.lc.h;

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {

        List<Character> list = new ArrayList<>();


        int k = 0;
        int windowStart = 0;
        int windowEnd = t.length() + windowStart + k;

        for (int i = 0; i < s.length(); i++) {

        }

        return "";
    }

    public static void main(String[] args) {
        MinimumWindowSubstring mws = new MinimumWindowSubstring();
        System.out.println(mws.minWindow("ADOBECODEBANC", "ABC"));
    }
}
