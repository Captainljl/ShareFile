package com.soundai.ltcode.strings;

import java.util.*;

/**
 * @author: liujialei
 * @create: 2020-02-29 17:13
 **/
public class Strings34 {

    class CharAndIndex  {
        private Character c;
        private int index;
        public CharAndIndex (Character c, int index) {
            this.c = c;
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CharAndIndex that = (CharAndIndex) o;
            return Objects.equals(c, that.c);
        }

        @Override
        public int hashCode() {
            return Objects.hash(c);
        }

    }

    public static void main(String[] args) {
        Strings34 strings34 = new Strings34();
        System.out.println(strings34.firstUniqChar("eletcode"));
    }

    public int firstUniqChar(String s) {
        Map<CharAndIndex, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            CharAndIndex charAndIndex = new CharAndIndex(s.charAt(i), i);
            if (map.containsKey(charAndIndex)) {
                map.put(charAndIndex, map.get(charAndIndex) + 1);
            } else {
                map.put(charAndIndex, 1);
            }
        }
        Iterator<CharAndIndex> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            CharAndIndex next = iterator.next();
            if (map.get(next) == 1) {
                return next.index;
            }
        }
        return -1;
    }

}
