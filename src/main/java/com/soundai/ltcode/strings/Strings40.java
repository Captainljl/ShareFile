package com.soundai.ltcode.strings;

/**
 * @author: liujialei
 * @create: 2020-03-02 16:31
 **/
public class Strings40 {

    public static void main(String[] args) {
        Strings40 strings40 = new Strings40();
        String[] strs = new String[]{"abc"};
        System.out.println(strings40.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Character c = null;
            for (String str : strs) {
                if (i == str.length()) {
                    return sb.toString();
                }
                if (c == null) {
                    c = str.charAt(i);
                } else {
                    if (c != str.charAt(i)) {
                        return sb.toString();
                    }
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
