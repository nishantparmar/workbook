package com.nishant.problems.lc.m;

//https://leetcode.com/problems/maximum-product-subarray/
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int product = Integer.MIN_VALUE;
        int windowProduct = 0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowProduct *= nums[windowEnd]; // add the next element
            // shrink the window as small as possible until the 'windowProduct' is smaller than 'S'
            while (windowProduct >= product) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowProduct -= nums[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        MaximumProductSubarray mps = new MaximumProductSubarray();
        System.out.println(mps.maxProduct(nums));
    }

}
