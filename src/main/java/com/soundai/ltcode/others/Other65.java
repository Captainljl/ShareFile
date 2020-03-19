package com.soundai.ltcode.others;

/**
 * @author: liujialei
 * @create: 2020-03-10 08:17
 **/
public class Other65 {

    public static void main(String[] args) {
        Other65 other65 = new Other65();
        System.out.println(other65.hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        String xStr = Integer.toBinaryString(x);
        String yStr = Integer.toBinaryString(y);
        int length = Math.max(xStr.length(), yStr.length());
        int distance = 0;
        for (int i = 0; i < length; i++ ) {
            char xc, yc;
            if (i >= xStr.length()) {
                xc = '0';
            } else {
                xc = xStr.charAt(xStr.length() - i - 1);
            }
            if (i >= yStr.length()) {
                yc = '0';
            } else {
                yc = yStr.charAt(yStr.length() - i - 1);
            }
            if (xc != yc) {
                distance++;
            }
        }
        return distance;
    }
}
