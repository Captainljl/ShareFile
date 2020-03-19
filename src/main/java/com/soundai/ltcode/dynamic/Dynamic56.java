package com.soundai.ltcode.dynamic;

/**
 * @author: liujialei
 * @create: 2020-03-08 22:48
 **/
public class Dynamic56 {

    public static void main(String[] args) {
        Dynamic56 dynamic56 = new Dynamic56();
        System.out.println(dynamic56.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        //dp 算上当前index所能获得的最大值
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int ret =dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-1], nums[i]);
            ret = Math.max(ret, dp[i]);
        }
        return ret;
    }

}
