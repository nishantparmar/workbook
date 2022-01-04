package com.nishant.problems.leetcode;

/**
 * Given an array of sorted numbers, remove all duplicates from it.
 * You should not use any extra space;
 * after removing the duplicates in-place return the length of the subarray that has no duplicate in it.
 */
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//EASY
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(remove(arr));
    }

    public static int remove(int[] arr) {
        int j = 1; // index of the next non-duplicate element
        for (int i = 1; i < arr.length; i++) {
            if (arr[j - 1] != arr[i]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

}