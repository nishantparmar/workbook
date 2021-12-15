package com.nishant.algo.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest extends BubbleSort {
    @Test
    void bubbleSort() {
        int[] input = {8,2,4,6,1,11,5};
        System.out.println(Arrays.toString(sortRecursive(input)));

    }
}