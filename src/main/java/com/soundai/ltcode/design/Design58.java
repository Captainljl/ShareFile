package com.soundai.ltcode.design;

import java.util.Random;

/**
 * @author: liujialei
 * @create: 2020-03-09 09:49
 **/
public class Design58 {

    private int[] nums;
    private int[] numOrigin;
    private Random random = new Random();

    public Design58(int[] nums) {
        this.nums = nums;
        this.numOrigin = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = numOrigin;
        numOrigin = numOrigin.clone();
        return numOrigin;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            int randIndex = random.nextInt(nums.length - i);
            swap(nums, i, i + randIndex);
        }
        return nums;
    }

    private void swap(int[] nums, int i, int randIndex) {
        int temp = nums[i];
        nums[i] = nums[randIndex];
        nums[randIndex] = temp;
    }

}
