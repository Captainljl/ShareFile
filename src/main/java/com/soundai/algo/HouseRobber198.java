package com.soundai.algo;

public class HouseRobber198 {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        //求最大值的方法，前一项和下一项之前有关系，首先想到是动态规划来做
        int[] dp = new int[nums.length+1];

        //初始化动态规划数组
        dp[0] = 0;
        dp[1] = nums[0];

        //求解出递推关系
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }


        return dp[nums.length];
    }
}
