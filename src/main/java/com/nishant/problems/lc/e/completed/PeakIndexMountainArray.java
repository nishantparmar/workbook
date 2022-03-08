package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

//COMPLETED
public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] nums = {0,2,1,0};
        System.out.println(findPeak(nums));
    }

    static int findPeak(int[] nums){
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
        return start;
    }

}
