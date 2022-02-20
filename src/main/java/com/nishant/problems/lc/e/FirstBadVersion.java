package com.nishant.problems.lc.e;

//https://leetcode.com/problems/first-bad-version/
//COMPLETED
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
            if (end - start == 1) {
                if (isBadVersion(start)) {
                    return start;
                } else {
                    return end;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        FirstBadVersion fv = new FirstBadVersion();
        System.out.println(fv.firstBadVersion(90));
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        if (version >= 1) {
            return true;
        } else {
            return false;
        }
    }
}