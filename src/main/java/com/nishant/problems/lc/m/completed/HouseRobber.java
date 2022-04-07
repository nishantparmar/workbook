package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/house-robber/
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return findMax(nums, 0, nums.length-1);
    }

    private int findMax(int[] nums, int start, int end) {
        int dp1 = nums[start];
        int dp2 = Math.max(nums[start], nums[start+1]);
        int max = dp2;
        for (int i = start + 2; i <= end; i++) {
            max = Math.max(nums[i] + dp1, dp2);
            dp1= dp2;
            dp2 = max;
        }
        return max;
    }

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] houses = {1,2,3,1};
        System.out.println(hr.rob(houses));
    }
}
