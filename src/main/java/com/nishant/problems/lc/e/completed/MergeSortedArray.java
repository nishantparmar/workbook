package com.nishant.problems.lc.e.completed;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
//COMPLETED
public class MergeSortedArray {

    //Optimum solution
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m - 1;
        int l = n - 1;

        for (int i = nums1.length - 1; i >= 0 && l >= 0; i--) {
            if (k >= 0 && nums1[k] > nums2[l]) {
                nums1[i] = nums1[k];
                k--;
            } else {
                nums1[i] = nums2[l];
                l--;
            }
        }
    }
    //Other solution
    /*public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }*/


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 5};
        int n = 3;
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
