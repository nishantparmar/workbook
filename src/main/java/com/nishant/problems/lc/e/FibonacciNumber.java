package com.nishant.problems.lc.e;

//https://leetcode.com/problems/fibonacci-number/
//COMPLETED - Check other efficient way

//        Runtime: 22 ms, faster than 5.09% of Java online submissions for Fibonacci Number.
//        Memory Usage: 40.7 MB, less than 6.79% of Java online submissions for Fibonacci Number.
public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println(fn.fib(30));
    }
}