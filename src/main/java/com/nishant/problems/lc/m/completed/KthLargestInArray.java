package com.nishant.problems.lc.m.completed;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
//COMPLETED
class KthLargestInArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}