package com.nishant.problems.lc.e;

public class TribonacciNumber {
    public int tribonacci1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        return tribonacci(n) + tribonacci(n+1) + tribonacci(n+2);
    }

    public int tribonacci(int n) {
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


    public static void main(String[] args) {
        TribonacciNumber t = new TribonacciNumber();
        System.out.println(t.tribonacci(4));
    }
}
