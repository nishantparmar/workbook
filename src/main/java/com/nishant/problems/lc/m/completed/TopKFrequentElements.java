package com.nishant.problems.lc.m.completed;

import com.nishant.Utilities;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
//COMPLETED
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> frequency.get(b) - frequency.get(a));
        for (int x : frequency.keySet()) {
            maxHeap.add(x);
        }

        int i = 0;
        while (!maxHeap.isEmpty() && i < k) {
            result[i] = maxHeap.poll();
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        TopKFrequentElements top = new TopKFrequentElements();
        Utilities.printArray(top.topKFrequent(nums, 2));
    }

}
