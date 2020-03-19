package com.soundai.ltcode.array;

/**
 * @author: liujialei
 * @create: 2020-02-24 11:23
 **/
public class Array22 {

    public static void main(String[] args) {
        Array22 array22 = new Array22();
        System.out.println(array22.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }

        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            profit += prices[i + 1] - prices[i] > 0 ? prices[i + 1] - prices[i] : 0;
        }

        return profit;
    }

}
