package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/string-compression/
public class CompressString {
    //e.g. "aabb"
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = "" + (j - i);
                char[] counts = count.toCharArray();
                for (int k = 0; k < counts.length; k++) {
                    chars[index++] = counts[k];
                }
            }
            i = j;
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "aabb";
        CompressString cs = new CompressString();
        System.out.println(cs.compress(str.toCharArray()));
    }
}
