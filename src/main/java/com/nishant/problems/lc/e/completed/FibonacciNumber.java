package com.nishant.problems.lc.e.completed;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/fibonacci-number/
public class FibonacciNumber {
    public int fib(int n) {
        return fibonacci(n, new HashMap<Integer, Integer>());
    }

    public int fibonacci(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 0) return 0;
        if (n == 1) return 1;
        int m = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, m);
        return m;
    }

    // using non memoization
    public int fib1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println(fn.fib(30));
    }
}