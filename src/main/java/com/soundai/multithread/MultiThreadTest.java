package com.soundai.multithread;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: liujialei
 * @create: 2019-11-06 10:43
 **/
public class MultiThreadTest {

    private int THREAD_NUM = 2;

    private ThreadPoolExecutor executor = new ThreadPoolExecutor(
            THREAD_NUM, THREAD_NUM,
            0L, TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<>(2), // 未处理的任务的等待队列
            (r, executor) -> {
                try {
                    executor.getQueue().put(r);
                } catch (InterruptedException e) {
                    throw new RejectedExecutionException("interrupted", e);
                }
            }
    );

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MultiThreadTest multiThreadTest = new MultiThreadTest();


        List<Future> futures = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            System.out.println("queue size is : " + multiThreadTest.executor.getQueue().size());
            Future<?> future = multiThreadTest.executor.submit(new TestThead());

            System.out.println("execute succ " + i);
        }

        for (Future future: futures) {
            System.out.println(future.get());
        }

        multiThreadTest.executor.shutdown();

    }
}
