package com.nishant.problems.lc.e;

import com.nishant.Utilities;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum
//COMPLETED
public class TwoSum {
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
        int[] nums = {3, 3};

        TwoSum ts = new TwoSum();
        //System.out.println(ts.binarySearch(nums, 0, nums.length, 0));
        Utilities.printArray(ts.twoSum(nums, 6));
    }
}
