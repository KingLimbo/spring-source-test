package com.limbo.study.juc.cas;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * spring-source-test
 *
 * @author : limbo
 * @date : 2020/9/2
 */
public class AutomicTest01 {
    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 5, 1, TimeUnit.DAYS,
            new ArrayBlockingQueue<Runnable>(10));

    public static void main(String[] args) throws InterruptedException {
        AutoIncrementTread autoIncrementTread = new AutoIncrementTread();
        for (int i = 0; i < 10; i++) {
            poolExecutor.execute(autoIncrementTread);
        }
        poolExecutor.isShutdown();
    }
}

class AutoIncrementTread implements Runnable{

    private volatile int count;

    public int getCount() {
        return count;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println("count should are 10,but is " + getCount());
    }
}
