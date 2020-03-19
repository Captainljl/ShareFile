package com.soundai.ltcode.array;
import javafx.util.Pair;

import	java.util.HashMap;
import	java.util.Map;

import java.util.Arrays;
import java.util.Map;

/**
 * @author: liujialei
 * @create: 2020-02-26 09:08
 **/
public class Array26 {


    public static void main(String[] args) {
        Array26 array26 = new Array26();
        int[] nums2 = new int[]{0, 3,4,5,9};
        int[] nums1 = new int[]{9,10,11};
        System.out.println(Arrays.toString(array26.intersect(nums1, nums2)));
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        int[] ret = new int[nums1.length];
        int currentLength = 0;
        int[] temp = new int[nums1.length];
        //nums2不动， nums1 向后移动
        for (int i = -nums1.length + 1; i < nums2.length; i++) {
            Pair<int[], Integer> commonArray = getCommonArray(i, nums1, nums2);
            if (commonArray.getValue() > currentLength) {
                ret = commonArray.getKey();
                currentLength = commonArray.getValue();
            }
        }
        int[] finalNums = new int[currentLength];
        for (int i = 0; i < currentLength; i++) {
            finalNums[i] = ret[i];
        }
        return finalNums;
    }

    private Pair<int[], Integer> getCommonArray(int i, int[] nums1, int[] nums2) {
        int retLength = 0;
        int[] retNums = new int[nums1.length];
        if (i <= 0) {
            //nums1 在 nums2 前面，重合的部分在
            for (int j = 0; j < nums1.length + i; j++) {
                int tempLength = 0;
                int[] tempNums = new int[nums1.length];
                while (j < nums1.length + i && nums1[-i + j] == nums2[j]) {
                    tempNums[tempLength ++] = nums1[-i + j];
                    j++;
                }
                if (tempLength > retLength) {
                    retLength = tempLength;
                    retNums = tempNums;
                }
            }
        } else if (i < nums2.length - nums1.length) {
            for (int j = 0; j < nums1.length; j++) {
                int tempLength = 0;
                int[] tempNums = new int[nums1.length];
                while (j < nums1.length && nums1[j] == nums2[j + i]) {
                    tempNums[tempLength++] = nums1[j];
                    j++;
                }
                if (tempLength > retLength) {
                    retLength = tempLength;
                    retNums = tempNums;
                }
            }
        } else {
            int tempLength = 0;
            int[] tempNums = new int[nums1.length];
            for (int j = 0; j + i < nums2.length; j++) {
                while (j+i < nums2.length && nums1[j] == nums2[j+i]) {
                    tempNums[tempLength++] = nums1[j];
                    j++;
                }
                if (tempLength > retLength) {
                    retLength = tempLength;
                    retNums = tempNums;
                }
            }
        }
        return new Pair<> (retNums, retLength);
    }

}
