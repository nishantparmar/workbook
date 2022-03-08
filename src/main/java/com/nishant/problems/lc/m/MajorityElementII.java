package com.nishant.problems.lc.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/majority-element-ii/
class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int maj = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if(map.get(nums[i]) > maj && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        MajorityElementII me2 = new MajorityElementII();
        System.out.println(me2.majorityElement(nums));
    }
}