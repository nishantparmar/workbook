package com.nishant.problems.lc.e;
//https://leetcode.com/problems/sum-of-square-numbers/
public class SumSquareNumbers {
    public boolean judgeSquareSum(int c) {

        //two pointer solution
        for (int i = 1; i < c; i++) {
//            int sqr = i*i;
//            int temp = c- sqr;
//            int sqrRoot = sqrRoot(temp);
//            if(sqr + sqrRoot == c){
//                return false;
//            }
//            return judgeSquareSum(temp);
        }
        return true;
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
        SumSquareNumbers ssn = new SumSquareNumbers();
        System.out.println(ssn.judgeSquareSum(5));
    }
}
