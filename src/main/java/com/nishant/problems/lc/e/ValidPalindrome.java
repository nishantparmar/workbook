package com.nishant.problems.lc.e;

//https://leetcode.com/problems/valid-palindrome/
//COMPLETED
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s= s.toLowerCase();
        int length = s.length();
        if(length<2){
            return true;
        }
        if(length ==2 && s.charAt(0) != s.charAt(1)){
            return false;
        }
        int mid = length/2;
        char[] c = s.toCharArray();
        for (int i = 0; i < mid; i++) {
            int secondindex = length - 1;
            if(secondindex >= mid){
                if(c[i] != c[secondindex]){
                    return false;
                }
            }else {
                break;
            }
            length--;
        }
        return true;
    }
    public boolean isPalindrome_efficient(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while(i <= s.length() - 1 && !isAlphaNum(s.charAt(i))) {
                i++;
            }
            while(j >= 0 && !isAlphaNum(s.charAt(j))) {
                j--;
            }
            if(i > j) break;
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(Character.toUpperCase(a) != Character.toUpperCase(b)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("0P"));
    }

}
