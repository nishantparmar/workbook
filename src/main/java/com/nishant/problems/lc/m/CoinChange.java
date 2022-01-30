package com.nishant.problems.lc.m;

import java.util.Arrays;

//https://leetcode.com/problems/coin-change/
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int d[] = new int[amount+1];
        d[0] = 1;

        return -1;
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        CoinChange c = new CoinChange();
        System.out.println(c.coinChange(coins, amount));
    }
}
