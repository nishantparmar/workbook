package com.nishant.problems.lc.e;
//https://leetcode.com/problems/reverse-string/
//EASY
//COMPLETE
public class ReverseString {
    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        ReverseString r = new ReverseString();
        r.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] c) {
        if(c == null) return;
        int mid = c.length / 2;
        for (int i = 0; i < c.length; i++) {
            if(i== mid)break;
            char temp = c[i];
            c[i] = c[c.length-1 - i];
            c[c.length-1 - i] = temp;
        }
    }
}
