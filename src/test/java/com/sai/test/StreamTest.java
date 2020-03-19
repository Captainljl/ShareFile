package com.sai.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: liujialei
 * @create: 2019-12-10 12:22
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("abc1");
        lists.add("abc2");
        lists.add("abc3");
        lists.add("abc4");
        List<String> collect = lists.stream().map(s -> {
            return "haha" + s;
        }).collect(Collectors.toList());
        System.out.println(Arrays.toString(new List[]{collect}));
    }
}
