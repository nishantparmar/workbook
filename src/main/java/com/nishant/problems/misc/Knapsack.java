package com.nishant.problems.misc;

import java.util.*;

//Merry’s wants to carry some fruits in the knapsack to get maximum profit.
// Here are the weights and profits of the fruits:
//
//        Items: { Apple, Orange, Banana, Melon }
//        Weights: { 2, 3, 1, 4 }
//        Profits: { 4, 5, 3, 7 }
//        Knapsack capacity: 5
//
//        Let’s try to put different combinations of fruits in the knapsack, such that their total weight is not more than 5:
//
//        Apple + Orange (total weight 5) => 9 profit
//        Apple + Banana (total weight 3) => 7 profit
//        Orange + Banana (total weight 4) => 8 profit
//        Banana + Melon (total weight 5) => 10 profit
public class Knapsack {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        int items = weights.length;
        Map<Integer, List> combinations = new HashMap();
        int sum = 0;
        for(int i =0 ; i < items; i++){
            for(int j =1 ; j < items; j++) {
                if(combinations.get(i) == null){
                    List newList = new ArrayList();
                    newList.add(i);
                    combinations.put(i, newList);
                }else{
                    combinations.get(i).add(j);
                }

            }
        }

        for (Map.Entry<Integer, List> entry : combinations.entrySet()) {
            int key = entry.getKey();
            List value = entry.getValue();

            System.out.println(value.toString());

        }


        return -1;
    }

    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }

}
