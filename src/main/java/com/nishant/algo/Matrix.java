package com.nishant.algo;

import java.util.Arrays;

public class Matrix {

    int[] search(int[][] matrix, int target) {

        int row = 0;
        int column = matrix.length - 1;

        while (row <= matrix.length - 1 && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }

            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        Matrix m = new Matrix();
        System.out.println(Arrays.toString(m.search(matrix, 37)));

        int[][] matrixMN = {
                {1,2},
                {3,1}
        };

        System.out.println(Arrays.toString(m.search(matrixMN, 3)));

    }
}
