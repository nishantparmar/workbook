package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/house-robber-ii/
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(findMax(nums, 0, nums.length-2),
                findMax(nums, 1, nums.length-1));
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
        HouseRobberII hr = new HouseRobberII();
        int[] houses = {2, 3, 2};
        System.out.println(hr.rob(houses));
    }
}
