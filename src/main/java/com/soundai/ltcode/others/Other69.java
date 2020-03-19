package com.soundai.ltcode.others;

import com.sun.javafx.binding.StringFormatter;

import java.text.MessageFormat;

/**
 * @author: liujialei
 * @create: 2020-03-10 11:18
 **/
public class Other69 {

    public static void main(String[] args) {
        System.out.println(MessageFormat.format("ab.${0}", "c"));
    }

    public int missingNumber(int[] nums) {
        int sum = (nums.length - 1) * nums.length /2 + nums.length;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

}
