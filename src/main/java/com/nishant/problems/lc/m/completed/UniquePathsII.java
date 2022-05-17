package com.nishant.problems.lc.m.completed;

import java.util.HashMap;

//https://leetcode.com/problems/unique-paths-ii/
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        //check if obstacle is on start or at end
        if (obstacleGrid[m - 1][n - 1] == 1) return 0;
        if (obstacleGrid[0][0] == 1) return 0;

        return gridTraveler(obstacleGrid, m, n, new HashMap<String, Integer>());
    }

    private int gridTraveler(int[][] obstacleGrid, int row, int column, HashMap<String, Integer> memo) {
        String key = row + "," + column;
        if (memo.containsKey(key)) return memo.get(key);
        if (row == 1 && column == 1) return 1;
        if (row == 0 || column == 0) return 0;
        if (obstacleGrid[row - 1][column - 1] == 1) return 0;
        int result = gridTraveler(obstacleGrid, row - 1, column, memo) + gridTraveler(obstacleGrid, row, column - 1, memo);
        memo.put(key, result);
        return memo.get(key);
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{1, 0}};
        UniquePathsII up2 = new UniquePathsII();
        System.out.println(up2.uniquePathsWithObstacles(obstacleGrid));
    }
}
