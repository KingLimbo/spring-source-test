package com.limbo.study.pattern.singleton;

/**
 * 饿汉式单例
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
