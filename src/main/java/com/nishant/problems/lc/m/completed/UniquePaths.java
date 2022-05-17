package com.nishant.problems.lc.m.completed;

import java.util.HashMap;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return gridTraveler(m, n, new HashMap<String, Integer>());
    }

    private int gridTraveler(int row, int column, HashMap<String, Integer> memo) {
        String key = row + "," + column;
        if (memo.containsKey(key)) return memo.get(key);
        if (row == 1 && column == 1) return 1;
        if (row == 0 || column == 0) return 0;
        int result = gridTraveler(row - 1, column, memo) + gridTraveler(row, column - 1, memo);
        memo.put(key, result);
        return memo.get(key);
    }

    public static void main(String[] args) {
        UniquePaths up = new UniquePaths();
        System.out.println(up.uniquePaths(5, 4));
    }
}
