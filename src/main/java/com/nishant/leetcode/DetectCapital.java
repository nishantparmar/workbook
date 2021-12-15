package com.nishant.leetcode;

import java.util.Locale;

//COMPLETED
public class DetectCapital {

    public static void main(String[] args){
        String word = "HeH";
        System.out.println(detectCapitalUse(word));

    }

    public static boolean detectCapitalUse(String word) {
        if(word == null || word == ""){
            return false;
        }

        if(word.toUpperCase().equals(word)){
            return true;
        }

        if(word.toLowerCase().equals(word)){
            return true;
        }

        char[] chars = word.toCharArray();
        for(int i=1; i < chars.length; i++ ){
            String c = Character.toString(chars[i]);
            if(c.toUpperCase().equals(c)){
                return false;
            }
        }
        return true;
    }
}
