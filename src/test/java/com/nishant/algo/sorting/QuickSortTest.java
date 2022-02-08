package com.nishant.algo.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest extends QuickSort {

    @Test
    void sort() {
        int[] input = {3,1,8,4,12,11,19, 13, 16};
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println(Arrays.toString(input));
    }
}