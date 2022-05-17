package com.nishant.problems.misc;

import java.util.HashMap;

public class GridTraveler {
    public int gridTraveler(int row, int column) {
        return grid(row, column, new HashMap<String, Integer>());
    }

    int grid(int row, int column, HashMap<String, Integer> memo) {
        String key = row + "," + column;
        if (memo.containsKey(key)) return memo.get(key);
        if (row == 1 && column == 1) return 1;
        if (row == 0 || column == 0) return 0;
        int result =  grid(row - 1, column, memo) + grid(row, column - 1, memo);
        memo.put(key,result);
        return memo.get(key);
    }

    public static void main(String[] args) {
        GridTraveler gt = new GridTraveler();
        System.out.println(gt.gridTraveler(8,8));
    }
}
