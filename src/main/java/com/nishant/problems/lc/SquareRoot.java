package com.nishant.problems.lc;

//PENDING
public class SquareRoot {

    public static void main(String[] args) {

//        System.out.println(sqrRoot(9));
//        System.out.println(sqrRoot(4));
//        System.out.println(sqrRoot(1));
//        System.out.println(sqrRoot(0));
//        System.out.println(sqrRoot(5));

        System.out.println(sqrRoot(3));//expected 46339
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

}
