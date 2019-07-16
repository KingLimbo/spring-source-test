package com.limbo.learning.pattern.proxyPattern.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 实现了方法拦截器接口
 *
 * @author LF
 */
public class Hacker implements MethodInterceptor {

    /**
     * 拦截方法
     */
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        // 前置方法
        System.out.println("**** I am a hacker,Let's see what the poor programmer is doing Now...");
        // 代理方法
        proxy.invokeSuper(obj, args);
        // 后置方法
        System.out.println("****  Oh,what a poor programmer.....");

        return null;
    }

}
