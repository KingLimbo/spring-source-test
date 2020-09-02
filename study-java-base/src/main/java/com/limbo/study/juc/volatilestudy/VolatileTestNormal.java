package com.limbo.study.juc.volatilestudy;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * spring-source-test
 *  volatile 关键字
 *      保证--可见性，即所有计算操作在主存中进行操作
 *
 * @author : limbo
 * @date : 2020/9/1
 */
public class VolatileTestNormal {
    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 1, TimeUnit.HOURS, new LinkedBlockingQueue<Runnable>(1024));
    public static void main(String[] args) {
        PepoleVolatile pepole = new PepoleVolatile();
        poolExecutor.execute(pepole);
        poolExecutor.execute(()->{
            while (true) {
                if (pepole.isDead()) {
                    System.out.println("#####################");
                    break;
                }
            }
        });
        poolExecutor.shutdown();
    }
}

class PepoleVolatile implements Runnable {
    private volatile boolean dead = false;

    public boolean isDead(){
        return dead;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dead = true;
        System.out.println("is dead!" + isDead());
    }
}
