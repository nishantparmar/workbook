package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/word-search/
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == word.charAt(0) && dfs(board, row, col, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int row, int col, int count, String word) {
        if (count == word.length()) return true;

        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length || board[row][col] != word.charAt(count))
            return false;

        char temp = board[row][col];
        board[row][col] = ' ';

        boolean found = dfs(board, row+1, col, count + 1, word)
                || dfs(board, row -1 , col, count + 1, word)
                || dfs(board, row, col-1, count + 1, word)
                || dfs(board, row, col + 1, count + 1, word);
        board[row][col] = temp;
        return found;
    }
}
