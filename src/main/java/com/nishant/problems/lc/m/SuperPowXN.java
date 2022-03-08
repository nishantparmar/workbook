package com.nishant.problems.lc.m;
//https://leetcode.com/problems/super-pow/
public class SuperPowXN {

    public int superPow(int a, int[] b) {
        long number = 0;
        String str ="";
        for (int i = 0 ; i < b.length; i++) {
            str += b[i];
        }
        number = Long.parseLong(str);
        return myPow(a, number);
    }

    public int myPow(int x, long n) {
        if (n < 0) {
            x = 1 / x;
        }
        return pow(x, n);
    }

    int pow(int x, long n) {
        if (n == 0) {
            return 1;
        }
        int val = pow(x, n / 2);
        if (n % 2 == 0) {
            return val * val;
        } else {
            return x * val * val;
        }
    }
}
