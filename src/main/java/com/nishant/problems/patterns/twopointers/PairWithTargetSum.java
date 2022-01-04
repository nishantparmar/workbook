package com.nishant.problems.patterns.twopointers;

import java.util.HashMap;

/**
 * Given an array of sorted numbers and a target sum,
 * find a pair in the array whose sum is equal to the given target.
 */
//EASY
public class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
        int left = 0; //1st pointer
        int right = arr.length - 1; //2nd pointer
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum)
                return new int[]{left, right}; // found the pair

            if (targetSum > currentSum)
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] result = PairWithTargetSum.search(new int[]{1, 2, 3, 4, 6}, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = PairWithTargetSum.search(new int[]{2, 5, 9, 11}, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }

    //    public static int[] search(int[] arr, int targetSum) {
//        HashMap<Integer, Integer> nums = new HashMap<>(); // to store numbers and their indices
//        for (int i = 0; i < arr.length; i++) {
//            if (nums.containsKey(targetSum - arr[i]))
//                return new int[] { nums.get(targetSum - arr[i]), i };
//            else
//                nums.put(arr[i], i); // put the number and its index in the map
//        }
//        return new int[] { -1, -1 }; // pair not found
//    }

}
