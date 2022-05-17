package com.nishant.problems.lc.m;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int index = 0;
        while (index < board.length) {
            if (!isValid(board, index)) {
                return false;
            }
            index = index + 3;
        }
        return true;
    }

    private boolean isValid(char[][] board, int startRow) {
        List<Character> temp = new ArrayList<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startRow; j < startRow + 3; j++) {
                if (temp.contains(board[i][j])) {
                    return false;
                } else {
                    temp.add(board[i][j]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

    int[][] buildSudoku() {
        int[][] matrix = new int[9][9];
        matrix[0][0] = 5;
        matrix[0][1] = 3;
        matrix[0][4] = 7;
        matrix[1][0] = 6;
        matrix[1][3] = 1;
        matrix[1][4] = 9;
        matrix[1][5] = 5;

        matrix[2][1] = 8;
        matrix[2][2] = 9;


        return matrix;
    }
}
