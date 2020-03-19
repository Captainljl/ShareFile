package com.sai.test;

import junit.framework.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author: liujialei
 * @create: 2019-12-06 15:39
 **/
public class JavaTest {
    public static void main(String[] args) {
        TestTask t1 = new TestTask("t1",4);
        TestTask t2 = new TestTask("t2",4);
        TestTask t3 = new TestTask("t3",10);
        Future<?> future1 = ThreadPoolUtils.threadPoolExecutor.submit(t1);
        Future<?> future2 = ThreadPoolUtils.threadPoolExecutor.submit(t2);
        Future<?> future3 = ThreadPoolUtils.threadPoolExecutor.submit(t3);
        new Thread(() -> {
            try {
                future1.get(5, TimeUnit.SECONDS);
                System.out.println("future1 done");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                future2.get(5, TimeUnit.SECONDS);
                System.out.println("future2 done");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                future3.get(5, TimeUnit.SECONDS);
                System.out.println("future3 done");
            } catch (Exception e) {
                e.printStackTrace();
                future3.cancel(true);
            }
        }).start();
        System.out.println("all done");
    }
}
