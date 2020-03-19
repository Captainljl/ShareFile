package com.soundai.ltcode.array;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-02-28 00:07
 **/
public class Array27 {

    public static void main(String[] args) {
        Array27 array27 = new Array27();
        int[] ints = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(array27.plusOne(ints)));
    }


    public int[] plusOne(int[] digits) {
        int[] ret = digits;
        //全是9 ？
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                ret[i] = digits[i] + 1;
                for (int j = i + 1; j < digits.length; j++) {
                    ret[j] = 0;
                }
                return ret;
            }
        }

        ret = new int[digits.length + 1];
        ret[0] = 1;
        return ret;
    }

}
