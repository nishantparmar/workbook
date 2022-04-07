package com.nishant.problems.lc.e.completed;

import java.util.ArrayList;

//https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            if (!list.contains(i)) {
                k--;
                if (k == 0) return i;
            }
        }
        int overflow = arr[arr.length - 1];
        while (k > 0) {
            overflow++;
            k--;
            if (k == 0) break;
        }
        return overflow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3};
        int k = 1;
        KthMissingPositiveNumber kth = new KthMissingPositiveNumber();
        System.out.println(kth.findKthPositive(arr, k));
    }

}
