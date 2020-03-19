package com.soundai.ltcode.strings;

/**
 * @author: liujialei
 * @create: 2020-02-29 16:20
 **/
public class Strings33 {

    public static void main(String[] args) {
        Strings33 string33 = new Strings33();
        System.out.println(string33.reverse(-2147483412));
    }

    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

}
