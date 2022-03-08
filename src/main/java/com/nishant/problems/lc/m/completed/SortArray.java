package com.nishant.problems.lc.m.completed;

import java.util.Arrays;
//https://leetcode.com/problems/sort-an-array/
//COMPLETED
class SortArray {
    //Using Merge Sort
    public int[] sortArray(int[] numbers) {
        if (numbers.length == 1) return numbers;
        int mid = numbers.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(numbers, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(numbers, mid, numbers.length));
        return merge(left, right);
    }
    
    int[] merge(int[] left, int[] right) {
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
        SortArray sa= new SortArray();
        int[] numbers = {2,5,1,3,9,4,7,8};
        System.out.println(Arrays.toString(sa.sortArray(numbers)));
    }
}