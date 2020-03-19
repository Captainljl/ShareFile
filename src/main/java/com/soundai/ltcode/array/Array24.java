package com.soundai.ltcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: liujialei
 * @create: 2020-02-26 08:29
 **/
public class Array24 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() != i + 1) {
                return true;
            }
        }
        return false;
    }

}
