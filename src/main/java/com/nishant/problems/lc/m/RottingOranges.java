package com.nishant.problems.lc.m;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    class Pair {
        int x;
        int y;

        Pair(int i, int j) {
            x = i;
            y = j;
        }
    }

    public int orangesRotting(int[][] grid) {
        int minutes = 0;

        //count fresh oranges
        int freshOrages = 0;
        //add all rotten oranges coordinates in queue
        Queue<Pair> queue = new LinkedList<>();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == 2) {
                    queue.add(new Pair(row, column));
                } else if (grid[row][column] == 1) {
                    freshOrages++;
                }
            }
        }
        if (freshOrages == 0) {
            return 0;
        }

        int dx[] = {0, 0, -1, 1};
        int dy[] = {1, -1, 0, 0};

        //BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            minutes = minutes + size;
            for (int i = 0; i < size; i++) {
                Pair coordinate = queue.poll();
                for (int j = 0; j < dx.length; j++) {
                    int x = coordinate.x + dx[j];
                    int y = coordinate.y + dy[j];
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;

                    grid[x][y] = 2;
                    queue.add(new Pair(x, y));
                }
            }
        }
        return minutes;
    }

        public static void main (String[] args){
            int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
            RottingOranges ro = new RottingOranges();
            System.out.println(ro.orangesRotting(grid));
        }
    }
