package com.soundai.threemonths.topic11;

/**
 * @author: liujialei
 * @create: 2020-01-03 11:13
 **/
public class Solution {

    public static void main(String[] args) {
        System.out.println(5%3);
    }

    /**
     *  输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */
    public int count (int num) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num >> i & 1) == 1) {
                count++;
            }
        }
        return count;
    }


}
