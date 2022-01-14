package com.nishant.problems.lc.e;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/reverse-vowels-of-a-string/
//EASY
//Not Completed
public class ReverseStringII {

    public static void main(String[] args) {
        String str = "hello";
        ReverseStringII r = new ReverseStringII();
        System.out.println(r.reverseVowels(str));
    }

    public String reverseVowels(String s) {
        List vowels = new ArrayList();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length ; i++) {


        }


        for (int i = 0; i < c.length; i++) {
                char temp = c[i];
                c[i] = c[c.length - 1 - i];
                c[c.length - 1 - i] = temp;
        }
        return s;
    }


}
