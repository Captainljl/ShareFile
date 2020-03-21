package com.soundai.ltcode.others;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.Stack;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 * @author: liujialei
 * @create: 2020-03-21 09:29
 **/
public class Other66 {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        String reverse = reverse(s);
        return (int) (Long.parseLong(reverse, 2) << (32 - reverse.length()));
    }

    private String reverse(String s) {
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            sc.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!sc.isEmpty())
            sb.append(sc.pop());
        return sb.toString();
    }

    public static void main(String[] args) {
        Other66 other66 = new Other66();
        System.out.println(Integer.toBinaryString(-1073741825));
        System.out.println(other66.reverseBits(-3));
    }

}
