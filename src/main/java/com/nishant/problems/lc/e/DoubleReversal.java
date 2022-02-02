package com.nishant.problems.lc.e;

public class DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        int var1 = reverse(num);
        int var2 = reverse(var1);
        return var2 == var2;
    }

    int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            if ((x > 0 && rev > Integer.MAX_VALUE) || (x < 0 && rev < Integer.MIN_VALUE)) {
                return 0;
            }
            x /= 10;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        DoubleReversal dr = new DoubleReversal();
        System.out.println(dr.isSameAfterReversals(526));
    }
}
