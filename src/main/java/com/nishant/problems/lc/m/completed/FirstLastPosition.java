package com.nishant.problems.lc.m.completed;

import com.nishant.Utilities;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//COMPLETED
public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            }
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid;
                break;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        //found at end
        int indexFirst = -1;
        for (int i = end; i >= 0; i--) {
            if (nums[i] == target) {
                indexFirst = i;
            } else {
                break;
            }
        }

        int indexLast = -1;
        for (int i = end; i < nums.length; i++) {
            if (nums[i] == target) {
                indexLast = i;
            } else {
                break;
            }
        }

        return new int[]{indexFirst, indexLast};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7,8,8,10};

        FirstLastPosition flp = new FirstLastPosition();
        Utilities.printArray(flp.searchRange(nums, 6));
    }
}
