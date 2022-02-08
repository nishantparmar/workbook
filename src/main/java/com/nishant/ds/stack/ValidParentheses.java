package com.nishant.ds.stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args){

        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "([)]";
        System.out.println(str1 + "  ---  " + isValid(str1));
        System.out.println(str2 + "  ---  " + isValid(str2));
        System.out.println(str2 + "  ---  " + isValid(str3));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c: s.toCharArray()){
            if(Character.compare(c, '(') == 0 || Character.compare(c, '{') == 0 || Character.compare(c, '[') == 0){
                stack.push(c);
            }
            if(Character.compare(c, ')') == 0 || Character.compare(c, '}') == 0 || Character.compare(c, ']') == 0){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}


