package com.nishant.problems.lc.e.completed;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/find-lucky-integer-in-an-array/
public class FindLuckyInteger {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            if (!counts.containsKey(item)) {
                counts.put(item, 1);
            } else {
                counts.put(item, counts.get(item) + 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key == value && key > ans) {
                ans = key;
            }
        }
        return ans == 0? -1 : ans;
    }
}
