package com.soundai.ltcode.array;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-02-24 14:57
 **/
public class Array23_1 {


    public static void main(String[] args) {
        Array23_1 array23 = new Array23_1();
        int[] nums = new int[]{1,2,3,4,5,6};
        array23.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0 || nums.length == 1) {
            return;
        }
        //环状替换
        int startIndex = 0,temp = nums[startIndex], times = 0, begin = 0;
        while (times < nums.length) {
            //ready to replace pos
            int replaceIndex = (startIndex + k) % nums.length;
            startIndex = replaceIndex;
            int replaceValue = nums[replaceIndex];
            nums[replaceIndex] = temp;
            temp = replaceValue;
            times ++;
            if (begin == replaceIndex) {
                startIndex = ++begin;
                temp = nums[startIndex];
            }
        }


    }






}
