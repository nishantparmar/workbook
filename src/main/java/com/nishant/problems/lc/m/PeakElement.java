package com.nishant.problems.lc.m;

//https://leetcode.com/problems/find-peak-element/

public class PeakElement {

    public static void main(String[] args) {
        int[] nums = {0,2,1,0};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid]> nums[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return nums[start];
    }
}
