package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Found a mismatched pair - try both deletions
            if (s.charAt(i) != s.charAt(j)) {
                return (isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j));
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int i, int j) {
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
        ValidPalindromeII vp = new ValidPalindromeII();
        System.out.println(vp.validPalindrome("\"pidbliassaqozokmtgahluruufwbjdtayuhbxwoicviygilgzduudzgligyviciowxbhuyatdjbwfuurulhagtmkozoqassailbdip\""));
    }

}
