package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/rotate-array/
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int rotations = k % nums.length;
        reverse(nums, 0, rotations - 1);
        reverse(nums, rotations, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        RotateArray ra = new RotateArray();
        ra.rotate(nums, 3);
    }
}
