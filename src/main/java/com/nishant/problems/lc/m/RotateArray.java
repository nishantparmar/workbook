package com.nishant.problems.lc.m;

import com.nishant.Utilities;
//https://leetcode.com/problems/rotate-array/
//COMPLETED
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        k = nums.length - k;
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Utilities.printArray(nums);
        r.rotate(nums, 12);
        System.out.println();
        Utilities.printArray(nums);
    }

}
