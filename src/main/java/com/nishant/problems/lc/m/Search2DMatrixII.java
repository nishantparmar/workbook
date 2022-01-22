package com.nishant.problems.lc.m;

//https://leetcode.com/problems/search-a-2d-matrix-ii/
//COMPLETED
public class Search2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Search2DMatrix s = new Search2DMatrix();
        System.out.println(s.searchMatrix(matrix, 3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row <= matrix.length - 1 && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            }
            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }
}
