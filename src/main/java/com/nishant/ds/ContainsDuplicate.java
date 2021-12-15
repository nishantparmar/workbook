package com.nishant.ds;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {123, 132, 123};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        if (nums.length == 0) return false;
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && map.get(nums[i]) == nums[i]) return true;
            map.put(nums[i], nums[i]);
        }
        return false;
    }
}