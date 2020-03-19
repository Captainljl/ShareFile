package com.soundai.threemonths.topic12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-01-03 11:55
 **/
public class Solution {

    public static void main(String[] args) {
        new Solution().printNum(3);
    }
    /**
     * 输入数字n,按顺序打印从1位到最大n位的十进制整数 。例如：输入3，则从1打印到999.
     */
    public void printNum (int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        do {
            System.out.println(Arrays.toString(list.toArray()));
        } while (findNext(list).size() != n);
    }

    private List<Integer> findNext (List<Integer> numList) {
        int pri = 0;
        int index = 0;
        do {
            Integer integer = numList.get(index);
            if (integer == 9) {
                pri = 1;
                numList.set(index++, 0);
                numList.add(0);
            } else {
                numList.set(index, ++integer);
            }
        } while (pri == 1);
        return numList;
    }

}
