package com.soundai.threemonths.topic13;

/**
 * @author: liujialei
 * @create: 2020-01-03 14:45
 **/
public class Solution {

    /**
     * 面试题：机器人的运动范围
     * 题目：地上有一个m行n列的方格。一个机器人从坐标(0, 0)的格子开始移动，它
     * 每一次可以向左、右、上、下移动一格，但不能进入行坐标和列坐标的数位之和
     * 大于k的格子。例如，当k为18时，机器人能够进入方格(35, 37)，因为3+5+3+7=18。
     * 但它不能进入方格(35, 38)，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
     */
    private int count(int n, int m, int k) {
        if (n < 0 || m < 0) {
            return 0;
        }

        if (canBeHere(m, 0, k)) {

        } else {
            //k, 0

        }

        return 0;
    }


    private boolean canBeHere (int mIndex, int nIndex, int k) {
        int mSum = 0;
        for (int mod = mIndex & 10 ; mIndex < 10; mIndex /= 10, mSum += mod);
        mSum += mIndex;

        if (mSum > k) {
            return false;
        }
        int nSum = 0;
        for (int mod = nIndex & 10; nIndex < 10; nIndex /= 10, nSum += mod);
        nSum += nIndex;

        if (mSum + nSum > k) {
            return false;
        }
        return true;
    }

}
