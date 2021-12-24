package com.nishant.algo.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = {1, 9, 4, 3, 2};
        int[] sorted = mergeSort(numbers);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] mergeSort(int[] numbers) {
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
}
