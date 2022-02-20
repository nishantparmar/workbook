package com.nishant.problems.lc.e;

//https://leetcode.com/problems/reverse-only-letters/
//INCOMPLETE
class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        if(c == null) return s;
        int mid = c.length / 2;
        for (int i = 0; i < c.length; i++) {
            if(i== mid)break;
            if(isAlpha(c[i])) {
                char temp = c[i];
                c[i] = c[c.length - 1 - i];
                c[c.length - 1 - i] = temp;
            }
        }
        return new String(c);
    }
    boolean isAlpha(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static void main(String[] args) {
        String str = "a-bC-dEf-ghIj";
        ReverseOnlyLetters rs = new ReverseOnlyLetters();
        System.out.println(str);
        System.out.println(rs.reverseOnlyLetters(str));
    }
}