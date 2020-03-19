package com.soundai.ltcode.dynamic;

/**
 * @author: liujialei
 * @create: 2020-03-08 22:27
 **/
public class Dynamic54 {


    public static void main(String[] args) {
        Dynamic54 dynamic54 = new Dynamic54();
        System.out.println(dynamic54.climbStairs(10));
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
