package com.limbo.study.pattern.singleton;

/**
 * 双检验单例模式
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class DCLSingleton {

    private volatile static DCLSingleton instance;

    public static DCLSingleton getInstance(){
        if (instance == null) {
            synchronized(DCLSingleton.class){
                instance = new DCLSingleton();
            }
        }
        return instance;
    }
}
