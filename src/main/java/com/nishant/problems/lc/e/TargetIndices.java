package com.nishant.problems.lc.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-target-indices-after-sorting-array/
//COMPLETED
public class TargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList();
        for(int i=0; i < nums.length;i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        return result;
    }
}
