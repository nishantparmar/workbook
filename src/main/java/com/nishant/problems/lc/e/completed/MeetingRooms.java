package com.nishant.problems.lc.e.completed;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/meeting-rooms/
public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length <= 1) return true;
        boolean result = true;

        // sort the list in order to get the values at increasing order
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals2 = {{7, 10}, {2, 4}};
        MeetingRooms mr = new MeetingRooms();
        System.out.println(mr.canAttendMeetings(intervals1));
        System.out.println(mr.canAttendMeetings(intervals2));
    }

}
