package com.soundai.ltcode.strings;

/**
 * @author: liujialei
 * @create: 2020-03-02 15:57
 **/
public class Strings39 {

    public static void main(String[] args) {
        Strings39 strings39 = new Strings39();
        System.out.println(strings39.getString("111221"));
    }

    public String countAndSay(int n) {
        int index = 1;
        String ret = "1";
        while (index < n) {
            ret = getString(ret);
            index++;
        }
        return ret;
    }


    private String getString (String str) {
        if (str.length() == 1) {
            return 1 + str;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            while (i < str.length() && str.charAt(i - 1) == str.charAt(i)) {
                i++;
                count++;
            }
            sb.append(count).append(str.charAt(i - 1));
            count = 1;
        }
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            sb.append(1).append(str.charAt(str.length() - 1));
        }
        return sb.toString();
    }
}
