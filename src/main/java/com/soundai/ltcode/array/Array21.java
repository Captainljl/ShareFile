package com.soundai.ltcode.array;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-02-22 20:41
 **/
public class Array21 {
    public static void main(String[] args) {

        Array21 array21 = new Array21();
        int[] ints = {1,1};
        array21.removeDuplicates(ints);
        System.out.println(Arrays.toString(ints));


    }

    public int removeDuplicates(int[] nums) {

        int arrayLength = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            while ((index + 1) < nums.length && nums[index] == nums[index+1]) {
                index++;
            }
            if (index + 1 < nums.length) {
                nums[++arrayLength] = nums[index + 1];
            }

        }

        return arrayLength + 1;
    }


    public int removeDuplicatesPri(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
