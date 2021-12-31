package com.nishant.problems.patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem - Longest Substring with maximum K Distinct Characters (medium)
 * <p>
 * Given a string, find the length of the longest substring in it with no more than K distinct
 * characters.
 **/
//MEDIUM
public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
    }

    public static int findLength(String str, int k) {
        int windowStart = 0;
        int maxLength = 0;

        Map<Character, Integer> charOccurance = new HashMap<>();

        // in the following loop we'll try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightEnd = str.charAt(windowEnd);
            charOccurance.put(rightEnd, charOccurance.getOrDefault(rightEnd, 0) + 1);
            // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
            while (charOccurance.size() > k) {
                char leftChar = str.charAt(windowStart);
                charOccurance.put(leftChar, charOccurance.get(leftChar) - 1);
                if (charOccurance.get(leftChar) == 0) {
                    charOccurance.remove(leftChar);
                }
                windowStart++; // shrink the window
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
        }
        return maxLength;
    }
}
