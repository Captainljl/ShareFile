package com.sai.test;

import java.util.concurrent.TimeUnit;

/**
 * @author: liujialei
 * @create: 2019-12-07 15:48
 **/
public class TestTask implements Runnable {
    private int sleepTime;
    private String taskName;
    public TestTask(String taskName, int sleepTime) {
        this.sleepTime = sleepTime;
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " done!");
    }
}
