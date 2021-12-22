package com.nishant.problems.leetcode;

//COMPLETED
public class Palindrome {

    public static void main(String[] args) {
        int number = -1;
        System.out.println(isPalindrome(number));
    }

    static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        return x == ReverseInteger.reverse(x);
    }
}
