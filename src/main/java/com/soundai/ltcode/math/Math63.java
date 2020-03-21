package com.soundai.ltcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liujialei
 * @create: 2020-03-20 12:11
 **/
public class Math63 {

    public static void main(String[] args) {
        Math63 math63 = new Math63();
        System.out.println(math63.romanToInt(""));
    }

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int ret = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.keySet().contains(s.substring(i, i+2))) {
                ret += map.get(s.substring(i, ++i + 1));
            } else {
                ret += map.get(s.substring(i, i + 1));
            }
        }
        return ret;
    }

}
