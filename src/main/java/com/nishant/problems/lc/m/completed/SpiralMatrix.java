package com.nishant.problems.lc.m.completed;

import com.nishant.Utilities;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList result = new ArrayList<>();
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int curr_row = 0, curr_col = 0;
        while (curr_row < rowLength && curr_col < columnLength) {

            // 1 - Move right
            for (int i = curr_col; i < columnLength; i++) {
                result.add(matrix[curr_row][i]);
            }
            curr_row++; // 2. Move down

            for (int i = curr_row; i < rowLength; i++) {
                result.add(matrix[i][columnLength - 1]);
            }
            columnLength--; // 3. Move left

            if (curr_row < rowLength) {
                for (int i = columnLength - 1; i >= curr_col; i--) {
                    result.add(matrix[rowLength - 1][i]);
                }
                rowLength--; // 4. Move Up
            }

            if (curr_col < columnLength) {
                for (int i = rowLength - 1; i >= curr_row; i--) {
                    result.add(matrix[i][curr_col]);
                }
                curr_col++; // 5. Move right
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        Utilities.printMatrix(matrix);

        SpiralMatrix sm = new SpiralMatrix();
        System.out.println(sm.spiralOrder(matrix));
    }
}
