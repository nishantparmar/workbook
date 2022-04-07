package com.nishant.problems.lc.e.completed;

import java.util.HashMap;

//https://leetcode.com/problems/n-th-tribonacci-number/
//T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
public class NthTribonacciNumber {

    public int tribonacci(int n) {
        return trib(n, new HashMap<Integer, Integer>());
    }

    int trib(int n, HashMap<Integer, Integer> memo){
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int m = trib(n - 1, memo) + trib(n - 2, memo) + trib(n-3, memo);
        memo.put(n, m);
        return m;
    }

    //Another optimized approach
    public int tribonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int[] arr = new int[n+2];
        int result = 0;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i] + arr[i+1] + arr[i+2];
        }
        return arr[n];
    }
    //non optimized
    public int tribonacci1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int result = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        return result;
    }

    public static void main(String[] args) {
        NthTribonacciNumber t = new NthTribonacciNumber();
        System.out.println(t.tribonacci(35));
    }

}
