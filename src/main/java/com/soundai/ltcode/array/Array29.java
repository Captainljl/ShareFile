package com.soundai.ltcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: liujialei
 * @create: 2020-02-29 08:58
 **/
public class Array29 {

    private Map<Integer, Integer> indexMap = new HashMap<>();

    public static void main(String[] args) {
        Array29 array29 = new Array29();
        int[] ints = new int[]{2, 7, 11, 15};
        int[] ints1 = array29.twoSum(ints, 9);
        System.out.println(Arrays.toString(ints1));
    }

    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {
                        i, j
                    };
                }
            }
        }
        return new int[] {};
    }


    private int binarySearch(int[] nums,int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, start, mid-1);
        } else {
            return binarySearch(nums, target, mid + 1, end);
        }
    }



}
