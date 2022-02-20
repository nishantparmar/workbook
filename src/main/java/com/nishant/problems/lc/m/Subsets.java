package com.nishant.problems.lc.m;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/subsets/

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());// start by adding the empty subset
        for (int currentNumber : nums) {
            // we will take all existing subsets and insert the current number in them to create new subsets
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                // create a new subset from the existing subset and insert the current element to it
                List<Integer> set = new ArrayList<>(subsets.get(i));
                set.add(currentNumber);
                subsets.add(set);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        Subsets sub = new Subsets();
        System.out.println(sub.subsets(numbers));
    }
}
