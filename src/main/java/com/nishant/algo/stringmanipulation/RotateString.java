package com.nishant.algo.stringmanipulation;

public class RotateString {

    public boolean rotateString(String s, String goal) {
        return ((s.length() == goal.length()) && (s+goal).contains(goal));

    }
}
