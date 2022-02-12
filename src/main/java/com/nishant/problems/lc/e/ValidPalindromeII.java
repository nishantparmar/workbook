package com.nishant.problems.lc.e;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    /*public boolean validPalindrome(String s) {

        if(isPalindrom(s)){
            return true;
        }

        int index = 0;
        while(index < s.length()){
            s.replace(s.charAt(index), '0');


            index++;
        }

    }*/

    boolean isPalindrom(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while(i <= s.length() - 1) {
                i++;
            }
            while(j >= 0) {
                j--;
            }
            if(i > j) break;
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
