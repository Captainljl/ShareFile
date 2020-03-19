package com.soundai.ltcode.strings;

/**
 * @author: liujialei
 * @create: 2020-03-02 09:08
 **/
public class Strings37 {

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        Strings37 strings37 = new Strings37();
        System.out.println(strings37.myAtoi("9223372036854775808"));
    }

    public int myAtoi(String str) {
        str = str.trim();
        boolean isNeg = str.startsWith("-");
        if (str.startsWith("+") || str.startsWith("-")) {
            str = str.substring(1);
        }
        while (str.startsWith("0")) {
            str = str.substring(1);
        }
        int end = 0;
        for (; end < str.length() && Character.isDigit(str.charAt(end)); end++) {

        }

        try {

            String digitStr = isNeg ? "-" + str.substring(0, end) : str.substring(0, end);

            if (digitStr.length() > String.valueOf(Long.MAX_VALUE).length() - 1) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            long l = Long.parseLong(digitStr);
            if (l > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (l < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            return (int) l;
        } catch (Exception e) {
            return 0;
        }
    }



}
