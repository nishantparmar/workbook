package com.nishant.problems.lc.e;

public class StrStr {
    public int strStr(String haystack, String needle) {
        char[] hsChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();



        return -1;
    }

    public static void main(String[] args) {
        StrStr str = new StrStr();
        System.out.println(str.strStr("hello", "ll"));
    }
}
