package com.nishant.problems.lc.m;

//https://leetcode.com/problems/reverse-integer/
//PENDING
public class ReverseInteger {

    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            if ((x > 0 && rev > Integer.MAX_VALUE) || (x < 0 && rev < Integer.MIN_VALUE)) {
                return 0;
            }
            x /= 10;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(1534236469));
    }
}

