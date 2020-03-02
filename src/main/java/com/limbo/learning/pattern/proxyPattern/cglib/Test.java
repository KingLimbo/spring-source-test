package com.limbo.learning.pattern.proxyPattern.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * 测试类
 *
 * @author LF
 */
public class Test {

    public static void main(String[] args) {
        // 程序员初始化
        Programmer progammer = new Programmer();
        // 拦截器初始化
        Hacker hacker = new Hacker();
        // cglib 中加载器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        // 设置要创建动态代理的类
        enhancer.setSuperclass(progammer.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(hacker);
        Programmer proxy = (Programmer) enhancer.create();
        proxy.code();
    }
}
