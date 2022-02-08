package com.nishant.problems.lc.e;

//https://leetcode.com/problems/roman-to-integer/
//COMPLETED
public class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i + 1)))
                sum -= getValue(s.charAt(i));
            else
                sum += getValue(s.charAt(i));
        }
        return sum;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInt rti = new RomanToInt();
        System.out.println(rti.romanToInt("MCMXCIV"));
    }
}
