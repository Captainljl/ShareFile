package com.soundai.ltcode.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liujialei
 * @create: 2020-03-01 21:52
 **/
public class Strings35 {

    public static void main(String[] args) {
        Strings35 strings35 = new Strings35();
        System.out.println(strings35.isAnagram("anagram", "nagaraj"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            Integer integer = map.get(t.charAt(i));
            if (integer == null) {
                return false;
            } else if (integer == 1) {
                map.remove(t.charAt(i));
            } else {
                map.put(t.charAt(i) , map.get(t.charAt(i)) - 1);
            }
        }
        return true;
    }


}
