package com.nishant.algo.search;

public class BinarySearch {

    // [11,14,67,71,74,81,92,114,276,379,455,457,552,556]
    public int binarySearchRecursive(int[] input, int target) {
        return binarySearchRecursive(input, target, 0, input.length - 1);
    }

    private int binarySearchRecursive(int[] input, int target, int start, int end) {
        if (input == null) return -1;
        if (start > end) return -1;

        int mid = (start + end) / 2;
        if (input[mid] == target) return mid;
        if (input[mid] > target) {
            return binarySearchRecursive(input, target, start, mid - 1);
        } else {
            return binarySearchRecursive(input, target, mid + 1, end);
        }
    }

    // [11,14,67,71,74,81,92,114,276,379,455,457,552,556]
    public int binarySearchIterative(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (input[mid] == target) return mid;
            if (input[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int exponentialSearch(int[] input, int target){

        return -1;
    }

}
