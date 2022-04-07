package com.nishant.problems.lc.m;

import java.util.*;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> triplets;
        for (int i = 0; i < nums.length; i++) {
            triplets = new ArrayList<>();
            int current = nums[i];
            int target = current < 0 ? (-1) * current : current;
            int[] twoSum = twoSum(nums, target);
            triplets.add(nums[i]);
            triplets.add(twoSum[0]);
            triplets.add(twoSum[1]);
            result.add(triplets);
        }
        return result;
    }

    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int difference = target - arr[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{0, 0};
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(nums));
    }
}
