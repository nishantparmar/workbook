package com.nishant.problems.leetcode.slidingwindow;

//https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
//PENDING
public class MaximumSubarraySumK {
    public static void main(String[] args) {

//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4,5};
        int[] nums1 = {1,-1,5,-2,3};
        System.out.println(maximumSubarraySumK(nums1, 3));


    }

    public static int maximumSubarraySumK(int[] nums, int target) {

        int maxsize = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    maxsize = j + 1;
                }
            }
        }
        return maxsize;
    }

}
