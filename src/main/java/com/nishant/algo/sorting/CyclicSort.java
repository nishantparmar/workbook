package com.nishant.algo.sorting;

import java.util.Arrays;

public class CyclicSort {

    public void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,4,5,2};
        CyclicSort cs = new CyclicSort();
        cs.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
