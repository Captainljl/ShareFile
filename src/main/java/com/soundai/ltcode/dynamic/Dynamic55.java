package com.soundai.ltcode.dynamic;

/**
 * @author: liujialei
 * @create: 2020-03-08 22:34
 **/
public class Dynamic55 {

    public static void main(String[] args) {
        Dynamic55 dynamic55 = new Dynamic55();
        System.out.println(dynamic55.maxProfit(new int[] {7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int ret = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            ret = Math.max(ret, prices[i] - minPrice);
        }
        return ret;
    }

}
