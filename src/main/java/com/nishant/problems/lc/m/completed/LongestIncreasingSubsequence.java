package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        return result + 1;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(l.lengthOfLIS(nums));
    }

}
