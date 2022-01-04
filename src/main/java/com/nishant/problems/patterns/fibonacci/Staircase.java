package com.nishant.problems.patterns.fibonacci;

public class Staircase {

    public static void main(String[] args) {

    }

    static int countWays1(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        //1 Step
        int count1 = countWays1(n - 1);

        return count1;
    }

    int countWays3(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        //1 Step
        int count1 = countWays3(n - 1);

        //2 Steps
        int count2 = countWays3(n - 2);

        //3 Steps
        int count3 = countWays3(n - 3);

        return count1 + count2 + count3;
    }
}
