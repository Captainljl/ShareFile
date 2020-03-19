package com.soundai.ltcode.math;
import	java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-03-09 22:14
 **/
public class Math60 {

    public static void main(String[] args) {
        Math60 math60 = new Math60();
        System.out.println(Arrays.toString(math60.fizzBuzz(15).toArray()));
    }

    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<> ();
        for (int i = 1; i <= n; i ++) {
            if (i % 15 == 0) {
                ret.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                ret.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                ret.add("Buzz");
                continue;
            }
            ret.add(String.valueOf(i));
        }
        return ret;
    }

}
