package com.nishant;

import java.util.Arrays;
import java.util.List;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 */
public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println(canJump(nums));

    }

    public static boolean canJump(int[] nums) {
        List numList = Arrays.asList(nums);
        for(int i=0; i < nums.length; i++){
            int nextIndex = nums[i];
            if(numList.size() < nextIndex){
                return false;
            }
            // if(numList.get(nextIndex) == null){
            //     return false;
            // }
            i += nextIndex;

        }
        return true;
    }
}
