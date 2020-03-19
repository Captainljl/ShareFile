package com.soundai.ltcode.math;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: liujialei
 * @create: 2020-03-19 12:03
 **/
public class Math62 {

    public static void main(String[] args) {
        Math62 math62 = new Math62();
        System.out.println(math62.isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        int max = 3;
        while (max < n) {
            max *= 3;
        }
        if (max == n) {
            return true;
        }
        return false;
    }

}
