package com.nishant.problems.lc.h;

//https://leetcode.com/problems/first-missing-positive/
class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return nums[j+1];
            }
        }
        return 0;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        MissingPositive mp = new MissingPositive();
        System.out.println(mp.firstMissingPositive(nums));
    }
}