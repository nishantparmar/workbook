package com.nishant;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=0; j < nums.length; j++){
                if(nums[i] + nums[j] > max){
                    max = nums[i] + nums[j];
                }
            }
        }
        return max;
    }
}
