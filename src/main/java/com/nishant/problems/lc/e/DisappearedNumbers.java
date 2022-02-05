package com.nishant.problems.lc.e;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//COMPLETED
class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
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
                result.add(j+1);
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
        int[] nums = {1,1};
        DisappearedNumbers dn = new DisappearedNumbers();
        System.out.println(dn.findDisappearedNumbers(nums));
    }
}