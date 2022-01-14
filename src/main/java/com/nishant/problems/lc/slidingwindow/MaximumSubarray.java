package com.nishant.problems.lc.slidingwindow;

//PENDING
public class MaximumSubarray {
    public static void main(String[] args){

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};



    }

    public static int maxSubArraySize(int[] nums, int target) {
        int maxSize = 0;
        int windowSize = 0;
        int cWindowStart = 0;
        int windowEnd = target - 1;
        int pWindowStart = 0;

        for (int i = 0; i < target; i++) {
            windowSize = windowSize + nums[i];
        }

        int pWindowSize = windowSize;
        while (cWindowStart <= nums.length - target) {
            if (cWindowStart > 0) {
                int newSize = (pWindowSize - nums[pWindowStart]) + nums[windowEnd];
                if (newSize > maxSize) {
                    maxSize = newSize;
                }
                pWindowStart++;
                pWindowSize = newSize;
            }
            cWindowStart++;
            windowEnd++;
        }
        return maxSize;
    }
}
