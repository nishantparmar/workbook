package com.nishant.problems.lc.e.completed;

import java.util.Stack;

//https://leetcode.com/problems/reverse-only-letters/
class ReverseOnlyLetters {


    public String reverseOnlyLettersUsingStack(String s) {
        Stack<Character> letters = new Stack();
        for (char c: s.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }

    public String reverseOnlyLetters(String s){
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;

        while (start < end){
            while (start < end && !Character.isLetter(chars[start])){
                start++;
            }
            while (end > start && !Character.isLetter(chars[end])){
                end--;
            }

            //swap
            char temp = chars[start];
            chars[start++] = chars[end] ;
            chars[end--] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "abC-dEf";
        ReverseOnlyLetters rs = new ReverseOnlyLetters();
        System.out.println(str);
        System.out.println(rs.reverseOnlyLetters(str));
    }
}