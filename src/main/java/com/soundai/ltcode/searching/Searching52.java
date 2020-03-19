package com.soundai.ltcode.searching;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-03-08 16:29
 **/
public class Searching52 {

    public static void main(String[] args) {
        Searching52 searching52 = new Searching52();
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        searching52.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (index1 < m && index2 < n && nums1[index1] <= nums2[index2]) {
                temp[i] = nums1[index1++];
                continue;
            }
            if (index2 < n && index1 < m && nums2[index2] <= nums1[index1]) {
                temp[i] = nums2[index2++];
                continue;
            }
            if (index1 == m) {
                temp[i] = nums2[index2++];
                continue;
            }
            if (index2 == n) {
                temp[i] = nums1[index1++];
                continue;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }

}
