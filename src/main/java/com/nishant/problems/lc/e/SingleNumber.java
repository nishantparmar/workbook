package com.nishant.problems.lc.e;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        //Using Bit Manipulation xor
//        int x=0;
//        for(int y:nums)
//            x^=y;
//        return x;

        Map<Integer, Integer> m = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (m.get(nums[i]) == null) {
                m.put(nums[i], 1);
            } else {
                m.put(nums[i], m.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val == 1) return key;
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        SingleNumber sn = new SingleNumber();

        System.out.println(sn.singleNumber(nums));

    }
}


