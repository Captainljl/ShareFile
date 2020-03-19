package com.soundai.multithread;

import java.util.concurrent.Callable;

/**
 * @author: liujialei
 * @create: 2019-11-06 10:44
 **/
public class TestThead implements Callable<String> {


    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("111");
        return "hahaha ";
    }
}
