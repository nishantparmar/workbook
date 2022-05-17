package com.nishant.problems.lc.m;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SimplifyPath {
    public String simplifyPath(String path) {
        char[] ch = path.toCharArray();
        Queue can = new LinkedList();
        String temp = new String();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isLetterOrDigit(ch[i])){
                temp = temp + ch[i];
            }else {
                if(i < ch.length-1)
                temp = temp + "/";
                sb.append(temp);
                temp = new String();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        System.out.println(sp.simplifyPath("/home/.../"));
    }
}
