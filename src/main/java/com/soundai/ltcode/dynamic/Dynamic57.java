package com.soundai.ltcode.dynamic;

/**
 * @author: liujialei
 * @create: 2020-03-09 09:20
 **/
public class Dynamic57 {

    public static void main(String[] args) {
        Dynamic57 dynamic57 = new Dynamic57();
        System.out.println(dynamic57.rob(new int[] {
                1,2,3,1
        }));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        //dp[n]表示的是只盗窃前n家时候可以获得的最大值
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[nums.length - 1];
    }

}
