package com.limbo.study.juc.volatilestudy;

import java.util.concurrent.*;

/**
 * spring-source-test
 *
 * @author : limbo
 * @date : 2020/9/1
 */
public class VolatileTest01 {
    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 1, TimeUnit.HOURS, new LinkedBlockingQueue<Runnable>(1024));
    public static void main(String[] args) {
        Pepole pepole = new Pepole();
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

class Pepole implements Runnable {
    private boolean dead = false;

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
