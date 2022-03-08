package com.nishant.problems.lc.e.completed;

import com.nishant.Utilities;

import java.util.*;

//https://leetcode.com/problems/rank-transform-of-an-array/
//COMPLETED
class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        int[] result = new int[arr.length];
        Map<Integer,Integer> ranks = new HashMap();
        int rank = 1;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(ranks.get(val) == null) {
                ranks.put(val, rank);
                rank++;
            }else {
                ranks.put(val, ranks.get(val));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = ranks.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {37,12,28,9,100,56,80,5,12};
        ArrayRankTransform att = new ArrayRankTransform();
        Utilities.printArray(att.arrayRankTransform(nums));
    }
}