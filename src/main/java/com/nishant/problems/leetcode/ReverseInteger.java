package com.nishant.problems.leetcode;

//https://leetcode.com/problems/reverse-integer/
//PENDING
public class ReverseInteger {

    static int reverse(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        if(n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){
            return 0;
        }
        int digits = (int) (Math.log10(n)) + 1;
        return reverseRecursive(n, digits);
    }

    private static int reverseRecursive(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + reverseRecursive(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }


}

//    public static void main(String[] args) {
//        reverseInteger(1534236469);
//        System.out.println(sum);
//    }
//    static int sum = 0;
//    static void reverseInteger(int number) {
//        if (number == 0) return;
//        reverse(number);
//    }
//    static void reverse(int number) {
//        if (number == 0) return;
//        int rem = number % 10;
//        sum = sum * 10 + rem;
//        reverse(number / 10);
//    }
//}
