package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/design-tic-tac-toe/
//COMPLETED
class TicTacToe {

    private int[] rowCounter;
    private int[] colCounter;
    private int diagLeft;
    private int diagRight;
    private int n;

    public TicTacToe(int n) {
        rowCounter = new int[n];
        colCounter = new int[n];
        diagLeft = 0;
        diagRight = 0;
        this.n = n;
    }

    public int move(int row, int col, int player) {
        int move = player == 1 ? 1 : -1;
        rowCounter[row] = rowCounter[row] + move;
        colCounter[col] = colCounter[col] + move;

        if (row == col) diagLeft = diagLeft + move;
        if (row == n - col - 1) diagRight = diagRight + move;

        if (rowCounter[row] == n || colCounter[col] == n || diagLeft == n || diagRight == n) return 1;
        else if (rowCounter[row] == -n || colCounter[col] == -n || diagLeft == -n || diagRight == -n) return 2;
        else return 0;
    }
}