package org.practice;

public class BuyAndSellStock {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //You want to maximize your profit by choosing a single day to buy one stock
    // and choosing a different day in the future to sell that stock.
    //Return the maximum profit you can achieve from this transaction.
    // If you cannot achieve any profit, return 0.
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }

        int maxProfit =0;
        int leftBuy = 0;
        int rightSell =1;
        while(rightSell<prices.length){
            int currentPrice = prices[rightSell];
            int buyPrice = prices[leftBuy];
            if(buyPrice<currentPrice){
                int currentProfit = currentPrice - buyPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
            else{
                leftBuy = rightSell;
            }
            rightSell++;
        }
        return maxProfit;
    }
}
