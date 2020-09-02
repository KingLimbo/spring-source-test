package com.limbo.study.juc.cas;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * spring-source-test
 *  乐观锁（自己使用的时候不会有其他线程修改数据，所以不会加锁，只会在更新的时候进行判断）
 *      CAS全称 Compare And Swap（比较与交换），是一种无锁算法。在不使用锁（没有线程被阻塞）的情况下实现多线程之间的变量同步。
 *      java.util.concurrent包中的原子类就是通过CAS来实现了乐观锁。
 *
 *          CAS算法涉及到三个操作数：
 *          需要读写的内存值 V。
 *          进行比较的值 A。
 *          要写入的新值 B。
 *
 *          当且仅当 V 的值等于 A 时，CAS通过原子方式用新值B来更新V的值（“比较+更新”整体是一个原子操作），否则不会执行任何操作。
 *          一般情况下，“更新”是一个不断重试的操作。
 * @author : limbo
 * @date : 2020/9/2
 */
public class AutomicTestNormal {
    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 5, 1, TimeUnit.DAYS,
            new ArrayBlockingQueue<Runnable>(10));

    public static void main(String[] args) throws InterruptedException {
        AutoIncrementNormalTread autoIncrementTread = new AutoIncrementNormalTread();
        for (int i = 0; i < 10; i++) {
            poolExecutor.execute(autoIncrementTread);
        }
        poolExecutor.isShutdown();
    }
}

class AutoIncrementNormalTread implements Runnable{

    private AtomicInteger count = new AtomicInteger();

    public AtomicInteger getCount() {
        return count;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count.getAndIncrement();
        System.out.println("count should are 10,but is " + getCount().get());
    }
}
