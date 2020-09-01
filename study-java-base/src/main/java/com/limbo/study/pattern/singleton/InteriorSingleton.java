package com.limbo.study.pattern.singleton;

/**
 * 内部类单例模式
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class InteriorSingleton {
    private static class SingletonHolder {
        private static final InteriorSingleton INSTANCE = new InteriorSingleton();
    }
    public static final InteriorSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
