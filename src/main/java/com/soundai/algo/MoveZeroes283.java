package com.soundai.algo;

import java.util.Arrays;

public class MoveZeroes283 {

    public static void main(String[] args) {
        MoveZeroes283 moveZeroes283 = new MoveZeroes283();
        int[] nums = {0,1,0,3,12};
        moveZeroes283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes (int[] nums) {
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount ++;
            } else {
                nums[i - zeroCount] = nums[i];
            }
        }
        for (int i = zeroCount; i > 0; i--) {
            nums[nums.length - i] = 0;
        }

    }

}
