package com.nishant.problems;

import java.util.ArrayList;

public class ChangeMachine {
    // a public collection of available coins
    public static int[] coins = {25, 10, 5, 1};

    // function to recieve change in the form of coins
    public static ArrayList<Integer> getMinCoins(int amount) {
        ArrayList<Integer> change = new ArrayList<Integer>();
        for (int i = 0; i < coins.length; i++) {
            if (amount % coins[i] == 0) {
                addChange(amount, i, change);
                return change;
            } else {
                addChange(amount, i, change);
                amount = amount % coins[i];
            }
        }
        return change;
    }

    static void addChange(int amount, int index, ArrayList<Integer> change) {
        if (amount / coins[index] != 0) {
            int n = amount / coins[index];
            for (int j = 0; j < n; j++) {
                change.add(coins[index]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ChangeMachine.getMinCoins(13));
    }
}