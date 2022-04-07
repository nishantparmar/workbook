package com.nishant.problems.lc.e.completed;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/submissions/
//COMPLETED
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));

    }

    static boolean isValid(String str) {
        Stack stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = (char) stack.peek();
                    if (ch == ')' && top == '(' ||
                            ch == '}' && top == '{' ||
                            ch == ']' && top == '[') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
