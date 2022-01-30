package com.nishant.problems.lc.e;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class DoubleExistCheck {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] == 0 && arr[j] == 0) {
                    return true;
                } else if (arr[i] != 0 && arr[j] == 0) {
                    continue;
                }
                if (arr[j] != 0 && arr[j] * 2 == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    //More efficient solution
    public boolean checkIfExistEfficient(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.contains(i * 2)
                    && (!(set.contains(i / 2) && i % 2 == 0)))
                set.add(i);
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0};
        DoubleExistCheck d = new DoubleExistCheck();
        System.out.println(d.checkIfExist(arr));
    }
}
