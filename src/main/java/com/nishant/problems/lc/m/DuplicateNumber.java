package com.nishant.problems.lc.m;

import java.util.Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/
//COMPLETED - Make it more efficient
public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(i < n-1 && nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

//    public int findDuplicate1(int[] nums) {
//        int n = nums.length;
//        int eventualProduct = 1;
//        int actualProduct = 1;
//        for (int i = 1; i < n+1; i++) {
//            eventualProduct = eventualProduct*i;
//        }
//        for (int i = 0; i < n; i++) {
//            actualProduct = actualProduct*nums[i];
//        }
//        return eventualProduct%actualProduct;
//    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 3, 2};
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println(dn.findDuplicate(nums));
    }
}
