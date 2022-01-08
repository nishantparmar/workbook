package com.nishant.problems.patterns.mergeintervals;

//https://leetcode.com/problems/merge-intervals/
//MEDIUM
//In Progress
public class MergeIntervals {


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        merge(intervals);
    }

    public static int[][] merge(int[][] intervals) {
        int MIN = 0;
        int MAX = 0;

        for (int i = 0; i < intervals.length; i++) {
            int[] pair = intervals[i];

            if(MIN < pair[0] ){
                MIN = pair[0];
            }
            if(pair[1] > MAX){
                MAX = pair[1];
            }
        }
        return intervals;
    }
}
