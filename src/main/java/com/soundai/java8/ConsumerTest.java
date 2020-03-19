package com.soundai.java8;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author: liujialei
 * @create: 2019-12-23 16:25
 **/
public class ConsumerTest {

    @Test
    public void test_Consumer() {
        Consumer<String> consumer = s -> System.out.println(s);

        Stream<String> stream = Stream.of("aaa", "bbb", "ccc");
        stream.forEach(consumer);
        System.out.println("******************");

    }

}
