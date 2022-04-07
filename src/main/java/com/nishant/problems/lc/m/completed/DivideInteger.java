package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/divide-two-integers/
public class DivideInteger {
    public int divide(int dividend, int divisor) {
        int ans = dividend / divisor;
        if (ans <= Integer.MIN_VALUE && divisor == -1)
            ans = 2147483647;
        else if (ans < -2147483648)
            ans = -2147483648;
        return ans;
    }

    public static void main(String[] args) {
        DivideInteger divide = new DivideInteger();
        System.out.println(divide.divide(-1, 1));
    }
}
