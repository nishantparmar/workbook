package com.nishant.problems.lc.amazon;

import com.nishant.Utilities;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int output[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                output[0] = i;
                output[1] = map.get(target - nums[i]);
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int nums[] = {3, 3, 1};
        int target = 6;
        TwoSum ts = new TwoSum();
        Utilities.printArray(ts.twoSum(nums, target));
    }
}