package com.nishant.algo.sorting;

import com.nishant.Utilities;

public class QuickSort {

    public void sort(int[] input) {
        sort(input, 0, input[input.length - 1]);
    }

    private void sort(int[] input, int start, int end) {
        if (start >= end) return;
        int boundary = partition(input, start, end);
        sort(input, start, boundary);//left partition
        sort(input, boundary + 1, end);//right partition
    }

    private int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++)
            if (input[i] <= pivot)
                Utilities.swap(input, i, boundary++);
        return boundary;
    }

}
