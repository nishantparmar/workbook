package com.nishant.problems.lc.e.completed;

import com.nishant.Utilities;

import java.util.Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array
public class SquaresSortedArray {

    //Approach #1 - Two Pointers
    public int[] sortedSquares1(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];
        int highestSquareIdx = n - 1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                squares[highestSquareIdx--] = leftSquare;
                left++;
            } else {
                squares[highestSquareIdx--] = rightSquare;
                right--;
            }
        }
        return squares;
    }

    //Approach #2 A - Sorting (Default sort)
    public int[] sortedSquares2A(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    //Approach #2 B - Sorting (Merge sort)
    public int[] sortedSquares2B(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
            nums[i] = (-1)* nums[i];
        }
        return mergeSort(nums);
    }


    int[] mergeSort(int[] numbers) {
        if (numbers.length == 1) return numbers;
        int mid = numbers.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(numbers, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(numbers, mid, numbers.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        // add rest of items (surplus in either arrays)
        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] nums = {-10000, 0,0, 10000};
        SquaresSortedArray ssa = new SquaresSortedArray();
        Utilities.printArray(ssa.sortedSquares1(nums));
        System.out.println();
        Utilities.printArray(ssa.sortedSquares2A(nums));
        System.out.println();
        Utilities.printArray(ssa.sortedSquares2B(nums));
    }
}
