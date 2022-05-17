package com.nishant.problems.lc.amazon;

import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock bttobystock = new BestTimeToBuySellStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.print(bttobystock.maxProfit(prices));
    }
}
