package com.nishant.problems.lc.e;

import com.nishant.Utilities;

//https://leetcode.com/problems/largest-subarray-length-k/
class LargestSubarray {
    public int[] largestSubarray(int[] nums, int k) {




        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 2, 3};
        LargestSubarray l = new LargestSubarray();
        Utilities.printArray(l.largestSubarray(nums, 4));
    }
}