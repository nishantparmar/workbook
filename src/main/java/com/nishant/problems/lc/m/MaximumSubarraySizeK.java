package com.nishant.problems.lc.m;

//https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
//PENDING
public class MaximumSubarraySizeK {
    public static void main(String[] args) {

//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4,5};
        int[] nums1 = {1,-1,5,-2,3};
        System.out.println(maxSubArraySize(nums1, 3));

        int[] nums2 = {-2,-1,2,1};
        System.out.println(maxSubArraySize(nums2, 1));
    }

    public static int maxSubArraySize(int[] nums, int target) {

        int maxsize = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int ith = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[i] + nums[j];
                if (sum == target) {
                    maxsize = j + 1;
                }
            }
        }
        return maxsize;
    }

    public static int maxSubArraySize1(int[] nums, int target) {
        int maxSize = 0;
        int windowSize = 0;

        for (int i = 0; i < target; i++) {
            windowSize = windowSize + nums[i];
        }

        int cWindowStart = 1;
        int windowEnd = 2 * target - 1;
        int pWindowStart = 0;
        while (cWindowStart < nums.length - target) {
            int newSize = (windowSize - nums[pWindowStart]) + nums[windowEnd];
            if (newSize > maxSize) {
                maxSize = newSize;
            }
            pWindowStart++;
            cWindowStart++;
            windowEnd++;
        }
        return maxSize;
    }
}
