package com.soundai.ltcode.strings;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-02-29 16:05
 **/
public class Strings32 {

    public static void main(String[] args) {
        Strings32 strings32 = new Strings32();
        char[] s = new char[]{'h','e', 'l', 'l'};
        strings32.reverseString(s);
        System.out.println(Arrays.toString(s));
    }


    public void reverseString(char[] s) {
        swap(0, s.length - 1, s);
    }

    private void swap (int left, int right, char[] s) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }

}
