package com.nishant.problems.leetcode;

/**
 * Given a characters array letters that is sorted in non-decreasing order and
 * a character target, return the smallest character in the array that is larger than target.
 *
 * Note that the letters wrap around.
 *
 * For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 *
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 **/
//COMPLETED
public class SmallestNumber {

    public static void main(String[] args){
        char[] input = {'a','b'};
        char target = 'b';

        System.out.println(nextGreatestLetter(input,target));
    }

    public static char nextGreatestLetter(char[] input, char target) {
        int start = 0;
        int end = input.length - 1;

        if(input[end] < target){//wrap around
            return input[start];
        }

        if(input[end] == target) return input[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (input[mid] == target) return input[mid];
            if (input[mid] < target) {
                start = mid + 1;
            } else if(input[mid] > target){
                end = mid - 1;
            }else{
                return input[mid];
            }
        }
        return input[start];

    }
}
