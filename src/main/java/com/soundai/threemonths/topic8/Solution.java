package com.soundai.threemonths.topic8;

/**
 * @author: liujialei
 * @create: 2020-01-02 11:07
 **/
public class Solution {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public static void main(String[] args) {
        long l = count(100);
        System.out.println("result : " + l);
    }
    //dp[n] = dp[n-1] + dp[n-2];
    private static long count(int n) {
        if (n <= 2) {
            return 0;
        }
        int result = 0;
        long[] ans = new long[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        System.out.println(n);
        return ans[n];
    }


    public static int fibonacci(int n){
        if(n<2){
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
