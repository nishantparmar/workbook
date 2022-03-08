package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/maximum-subarray/
//COMPLETED
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i < nums.length; i++) {
            if (sum < 0) sum = 0;
            sum = sum+ nums[i];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray msa = new MaximumSubarray();
        System.out.println(msa.maxSubArray(nums));
    }

}
