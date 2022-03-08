package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/powx-n/
//COMPLETED
public class PowXN {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
        }
        return pow(x, n);
    }

    double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double val = pow(x, n / 2);
        if (n % 2 == 0) {
            return val * val;
        } else {
            return x * val * val;
        }
    }

    //Brute force
    public double myPow1(double x, int n) {
        long N = n;
        if (n == 0) return 1;
        if (x == 1.0) return x;
        double result = x;
        long count = N > 0 ? N : (-1) * N;
        for (long i = 0; i < count; i++) {
            result = x * result;
        }
        double ans = result / x;

        return n > 0 ? ans : 1 / ans;
    }

    public static void main(String[] args) {
        PowXN p = new PowXN();
        System.out.println(p.myPow(2.000, 10));
    }
}
