package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class MatrixByRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isSimilar(mat, target)) {
                return true;
            } else {
                rotate(mat);
            }
        }
        return false;
    }

    private boolean isSimilar(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void rotate(int[][] matrix) {
        //Transpose -- Row to Column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Flip Horizontally
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
