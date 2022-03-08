package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/missing-number/
//COMPLETED
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int eventualSum = 0;
        int actualSum = 0;

        for (int i = 0; i <= n; i++) {
            eventualSum = eventualSum + i;
        }
        for (int i = 0; i <= n - 1; i++) {
            actualSum = actualSum + nums[i];
        }
        return eventualSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}
