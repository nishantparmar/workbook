package com.nishant.problems.lc.e;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                map.put(i, nums[i]);
            }
        }

        int index = 0;
        for (Integer key : map.keySet()) {
            nums[index] = map.get(key);
            index++;
        }
        return map.size();
    }

    //Optimized - two pointers
    public int removeElement1(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
