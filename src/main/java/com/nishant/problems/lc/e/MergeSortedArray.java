package com.nishant.problems.lc.e;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
//PENDING
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] merged = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(merged));
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        return mergeSortedArray(nums1, nums2, m, n);
    }

    static int[] mergeSortedArray(int[] first, int[] second, int m, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (first[i] < second[j]) {
                first[k] = first[i];
                i++;
            } else {
                first[k] = second[j];
                j++;
            }
            k++;
        }

        // add rest of items (surplus in either arrays)
        while (i < m) {
            first[k] = first[i];
            i++;
            k++;
        }
        while (j < n) {
            first[k] = second[j];
            j++;
            k++;
        }
        return first;
    }
}
