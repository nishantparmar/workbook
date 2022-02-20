package com.nishant.problems.lc.h;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
//COMPLETED
public class MedianTwoSortedArrays {
    //simple O(m+n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            l.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            l.add(nums2[i]);
        }
        Collections.sort(l);
        if (l.size() % 2 != 0) {
            int mid = l.size() / 2;
            median = l.get(mid);
            return median;
        } else {
            int mid = l.size() / 2;
            median = (double) (l.get(mid) + l.get(mid - 1)) / 2;
            return median;
        }
    }

    public double medianOfSortedLists(int[] nums1, int[] nums2) {
        // both of them are sorted array
        // One thing to remember is though sorted the element distribution will be
        // different in each array
        // for the same reason we need to achieve a partition in both the array to balance Element Distribution
        // There by deriving the median

        // Lets  try to Partition 1st and 2nd arrays to  left side and right side
        // When we achieve a place where both left most elements are less than right most elements across the arrays
        // We arrive at a point to calculate the median

        // Lets try to work on the smallest array as first
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        // Partition of the first array
        // lets partition the first array  using Binary  to middle
        //  We need to find  such a point  where the sum of elements in left in both arrays
        //  should be equal to sum of elements on right side of the array

        int x = nums1.length;
        int y = nums2.length;

        int start = 0, end = x;
        //  Here we are trying to  do a binary search on the smaller array
        // Hence end we are starting at the length of x
        while (start <= end) {
            //  Remember we are doing binary search on num2  the smaller arrry
            int partitionX = (start + end) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            // Lets Derive  Max  Left in each array
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];

            //  Lets Calculate the minimum on right side of the Partition

            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            // Lets calculate the maximum number on left of partition in num2  (bigger Array)

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];

            // Calculate the Minmumon right side of the partition in Num2
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];
            // Now that we calculated the min Max vlaues around the partition
            // Lets go in to Business logic

            //the final and ideal partition logic

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) //  arrived at the right partition
            {
                // Lets build logic to calculate the median
                // if  combined size of array is even  median is  average of   max of  left  and Max of right
                if ((x + y) % 2 == 0)
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightY, minRightX)) / 2;
                else // this means total number of elements is odd and median is the center most element
                    //  which always lies on the left side  and highest among the both maximums on left side

                    return (double) Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftY > minRightX)   //  case where the parition is more towards left
            {
                start = partitionX + 1;
            } else  //  partition is more towards right
            {
                end = partitionX - 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        MedianTwoSortedArrays m = new MedianTwoSortedArrays();
        System.out.println(m.medianOfSortedLists(nums1, nums2));
    }

}
