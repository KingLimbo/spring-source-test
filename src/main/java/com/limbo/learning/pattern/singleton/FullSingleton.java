package com.limbo.learning.pattern.singleton;

/**
 * 饱汉式单例
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class FullSingleton {
    private static FullSingleton instance = new FullSingleton();

    public static synchronized FullSingleton getInstance(){
        return instance;
    }
}
