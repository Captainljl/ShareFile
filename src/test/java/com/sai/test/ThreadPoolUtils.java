package com.sai.test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: liujialei
 * @create: 2019-12-07 15:23
 **/
public class ThreadPoolUtils {
    public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2,
            60L, TimeUnit.SECONDS,new LinkedBlockingQueue<>(Runtime.getRuntime().availableProcessors() * 1024));

}
