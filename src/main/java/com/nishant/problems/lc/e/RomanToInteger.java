package com.nishant.problems.lc.e;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/
//PENDING
public class RomanToInteger {
    //    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static void main(String[] args) {

    }

    static int romanToInt(String s) {
        int result = 0;
        Map mapping = new HashMap<String, Integer>();
        mapping.putIfAbsent("I", 1);
        mapping.putIfAbsent("V", 5);
        mapping.putIfAbsent("X", 10);
        mapping.putIfAbsent("L", 50);
        mapping.putIfAbsent("C", 100);
        mapping.putIfAbsent("D", 500);
        mapping.putIfAbsent("M", 1000);

        char[] c = s.toCharArray();

        if (c[0] == 'I')

        for (int i = 0; i < c.length; i++) {

        }


        return result;
    }
}
