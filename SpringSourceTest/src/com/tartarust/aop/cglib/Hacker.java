package com.tartarust.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 实现了方法拦截器接口
 * 
 * @author LF
 *
 */
public class Hacker implements MethodInterceptor {

	/**
	 * 拦截方法
	 * 
	 */
	@Override
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
