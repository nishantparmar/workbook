package com.nishant.problems.lc.e;

//https://leetcode.com/problems/valid-perfect-square
//COMPLETED
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int sqrRoot = sqrRoot(num);
        return sqrRoot*sqrRoot == num;
    }

    private static int sqrRoot(int num) {
        int start = 0;
        int end = num;
        if (num < 2) {
            return num;
        }
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid > num) {
                end = (int) mid;
            } else if (mid * mid < num) {
                start = (int) mid;
            } else {
                return (int) mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();

        System.out.println(vps.isPerfectSquare(7));
    }
}
