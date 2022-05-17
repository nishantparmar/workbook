package com.nishant.problems.misc;

public class CanConstruct {
    public boolean canConstruct(String target, String[] wordBank) {
        if ("".equals(target)) return true;

        for (int i = 0; i < wordBank.length; i++) {
            if (target.indexOf(wordBank[i]) == 0) {
                String suffix = target.substring(wordBank.length);
                if (canConstruct(suffix, wordBank)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CanConstruct cc = new CanConstruct();
        String[] wordBank = {"ab", "abc", "cd", "def", "abcd"};
        System.out.println(cc.canConstruct("abcdef", wordBank));
    }
}
