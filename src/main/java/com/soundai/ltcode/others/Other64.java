package com.soundai.ltcode.others;

/**
 * @author: liujialei
 * @create: 2020-03-10 07:45
 **/
public class Other64 {

    public static void main(String[] args) {
        Other64 other64 = new Other64();
        System.out.println(other64.hammingWeight(-3));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                ret++;
            }
        }
        return ret;
    }



}
