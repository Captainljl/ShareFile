package com.soundai.ltcode.array;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-02-28 00:25
 **/
public class Array28 {


    public static void main(String[] args) {
        Array28 array28 = new Array28();
        int[] nums = new int[]{11,0,1,0,3,12};
        //int[] nums = new int[]{0,3,4,1,0,3,12};
        array28.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }


    /**
     *
     * @param nums
     */
    public void moveZeroes (int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] == 0) {
                zeroCount++;
                i++;
            }
            int nextIndex = moveZeroToNextZero(nums, i, zeroCount);
            i = nextIndex;
        }
        while (zeroCount > 0) {
            nums[nums.length - zeroCount] = 0;
            zeroCount--;
        }
    }

    private int moveZeroToNextZero(int[] nums, int i, int zeroCount) {
        for (int j = i; j < nums.length; j++) {
            while (j < nums.length && nums[j] != 0) {
                nums[j - zeroCount] = nums[j];
                return j;
            }
        }
        return nums.length;
    }


    public void wrongMoveToZero(int[] nums) {
        //快排
        quickSort(nums, 0, nums.length - 1);

        //move
        int zeroIndex = 0;
        while (zeroIndex < nums.length && nums[zeroIndex] == 0)
            zeroIndex++;
        if (zeroIndex == nums.length) {
            return;
        }
        //整体翻转
        rotate(nums, 0, nums.length - 1);
        //翻转0到zeroIndex的数组
        rotate(nums, 0, nums.length - 1 - zeroIndex);
    }

    private void rotate (int[] nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            swap(nums, startIndex++, endIndex--);
        }
    }


    private void quickSort (int[] nums, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        while (i != j) {
            //快排算法的核心的一点就是从右侧开始找
            while (i < j && nums[j] >= nums[left])
                j --;
            while (i < j && nums[i] <= nums[left])
                i ++;
            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, left, i);
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }

    private void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
