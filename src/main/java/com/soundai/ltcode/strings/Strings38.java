package com.soundai.ltcode.strings;

/**
 * @author: liujialei
 * @create: 2020-03-02 15:42
 **/
public class Strings38 {

    public static void main(String[] args) {
        Strings38 strings38 = new Strings38();
        System.out.println(strings38.strStr("abc", "ac"));
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (findWithIndex (haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean findWithIndex(String haystack, String needle, int i) {
        for (int j = 0; j < needle.length(); j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
