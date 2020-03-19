package com.soundai.ltcode.array;

/**
 * @author: liujialei
 * @create: 2020-02-26 08:59
 **/
public class Array25 {


    public static void main(String[] args) {
        Array25 array25 = new Array25();
        int[] ints = {4, 1, 2, 1, 2};
        System.out.println(array25.singleNumber(ints));
    }

    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret = ret ^ num;
        }
        return ret;
    }

}
