package com.soundai.ltcode.array;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: liujialei
 * @create: 2020-02-26 09:08
 **/
public class Array26_1 {


    public static void main(String[] args) {
        Array26_1 array26 = new Array26_1();
        int[] nums2 = new int[]{0, 3,4,5,9};
        int[] nums1 = new int[]{9,10,11};
        System.out.println(Arrays.toString(array26.intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }
        int[] temp = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            if (map.containsKey(num)) {
                temp[index++] = num;
                if (map.get(num) == 1) {
                    map.remove(num);
                } else {
                    map.put(num, map.get(num) - 1);
                }
            }
        }
        int[] ret = new int[index];
        for (int i = 0; i < index; i++) {
            ret[i] = temp[i];
        }
        return ret;
        
    }


}
