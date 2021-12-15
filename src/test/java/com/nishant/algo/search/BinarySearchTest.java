package com.nishant.algo.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest extends BinarySearch {

    int[] input;

    @BeforeEach
    void setUp() {
        input = new int[]{11, 14, 67, 71, 74, 81, 92, 114, 276, 379, 455, 457, 552, 556};
    }

    @Test
    void binarySearchRecursively() {
        int result = binarySearchRecursive(input, 276);
        System.out.println(result);
        Assertions.assertTrue(result >= 0);

        int result1 = binarySearchRecursive(input, 277);
        System.out.println(result1);
        Assertions.assertTrue(result1 == -1);
    }

    @Test
    void binarySearchItr() {
        int result = binarySearchIterative(input, 276);
        System.out.println(result);
        Assertions.assertTrue(result >= 0);

        int result1 = binarySearchIterative(input, 277);
        System.out.println(result1);
        Assertions.assertTrue(result1 == -1);
    }
}