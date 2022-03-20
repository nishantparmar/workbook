package com.nishant.problems.lc.m.completed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        //check if the given array is null or have only one value
        if (intervals.length <= 1) return intervals;
        //create a arraylist as we dont know how many value we will have !
        ArrayList<int[]> result = new ArrayList<>();


        // sort the list in order to get the values at increasing order
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // temp variable to store each value in arraylist
        int[] previous = intervals[0];
        result.add(previous);
        for (int[] temp : intervals) {
            if (previous[1] >= temp[0]) {
                previous[1] = Math.max(previous[1], temp[1]);
            } else {
                previous = temp;
                result.add(previous);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        MergeIntervals mi = new MergeIntervals();
        System.out.println(mi.merge(intervals));

    }

}
