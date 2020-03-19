package com.soundai.ltcode.strings;

/**
 * @author: liujialei
 * @create: 2020-03-01 22:20
 **/
public class Strings36 {

    public static void main(String[] args) {
        Strings36 strings36 = new Strings36();
        System.out.println(strings36.isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (!isComfit(s.charAt(left)) && left < right)
                left ++;
            while (!isComfit(s.charAt(right)) && left < right)
                right --;
            char leftc = Character.isAlphabetic(s.charAt(left)) ? Character.toLowerCase(s.charAt(left)) : s.charAt(left);
            char rightc = Character.isAlphabetic(s.charAt(right)) ? Character.toLowerCase(s.charAt(right)) : s.charAt(right);
            if (leftc != rightc) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    private boolean isComfit (Character c) {
        if ((c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9') ) {
            return true;
        }
        return false;
    }

}
