package com.nishant.problems.lc.e;

import java.util.*;

class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maj = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value> maj && value > max) {
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 7};
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }
}