package com.soundai.netty.chaptor2.p2;

import com.soundai.netty.chaptor2.p1.TimeServerHandler;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TimeServerHandlerPool {

    private ExecutorService executorService;

    public TimeServerHandlerPool(int maxPoolSize, int queueSize) {
        executorService = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                maxPoolSize, 120L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(queueSize));
    }

    public void execute(TimeServerHandler timeServerHandler) {
        executorService.execute(timeServerHandler);
    }
}
