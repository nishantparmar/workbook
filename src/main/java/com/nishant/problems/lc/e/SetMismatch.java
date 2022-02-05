package com.nishant.problems.lc.e;

import java.util.Arrays;
//https://leetcode.com/problems/set-mismatch/
//COMPLETED
class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
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
            if (nums[j] != j + 1) {
                result[0] = nums[j];
                result[1] = j+1;
            }
        }
        return result;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        SetMismatch sm = new SetMismatch();
        System.out.println(Arrays.toString(sm.findErrorNums(nums)));
    }
}