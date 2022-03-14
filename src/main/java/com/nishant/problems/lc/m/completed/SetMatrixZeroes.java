package com.nishant.problems.lc.m.completed;

import com.nishant.Utilities;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        List<Integer> rowsToZero = new ArrayList();
        List<Integer> columnToZero = new ArrayList();

        for (int row = 0; row < matrix.length; row++)//Cycles through rows
        {
            for (int col = 0; col < matrix[row].length; col++)//Cycles through columns
            {
                if (matrix[row][col] == 0) {
                    rowsToZero.add(row);
                    columnToZero.add(col);
                }
            }
        }

        for (int i = 0; i < rowsToZero.size(); i++) {
            //make rows zero
            for (int row = 0; row < matrix[rowsToZero.get(i)].length; row++)//Cycles through columns
            {
                matrix[rowsToZero.get(i)][row] = 0;
            }
        }

        for (int i = 0; i < columnToZero.size(); i++) {
            for (int col = 0; col < matrix.length; col++)//Cycles through columns
            {
                matrix[col][columnToZero.get(i)] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 0;
        matrix[1][2] = 6;
        matrix[1][3] = 7;

        matrix[2][0] = 8;
        matrix[2][1] = 9;
        matrix[2][2] = 10;
        matrix[2][3] = 0;
        Utilities.printMatrix(matrix);
        SetMatrixZeroes smz = new SetMatrixZeroes();
        smz.setZeroes(matrix);

        Utilities.printMatrix(matrix);
    }
}
