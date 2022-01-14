package com.nishant.problems.lc;

//PENDING
public class FirstLastPositionInArray {

    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        searchRange(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = findStartingPosition(nums, target);
        int last = findLastPosition(nums, start, target);

        int[] result = {start, last};

        return result;
    }

    private static int findStartingPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[start] == target) return start;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return (nums.length - 1) -mid;
            }
        }
        return -1;
    }

    //FIXME - Not completed
    private static int findLastPosition(int[] nums, int startIndex, int target){
        int end = startIndex+1;
        int start = nums.length - 1;

        while (start >= end) {
            int mid = end +  (start - end) / 2;
            if (nums[start] == target) return start;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
