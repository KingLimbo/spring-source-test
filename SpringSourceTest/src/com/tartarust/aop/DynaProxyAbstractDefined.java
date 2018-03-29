package com.tartarust.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyAbstractDefined implements InvocationHandler {

	private Object proxy;
	
	private Object delegate;
	
	public Object bind(Object delegate, Object proxy) throws ClassNotFoundException{
		this.proxy = proxy;
		this.delegate = delegate;
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader()
				, this.delegate.getClass().getInterfaces(), this);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			// 反射得到操作者实例
			Class clazz = this.proxy.getClass();
			// 反射得到操作者的start方法
			Method start = clazz.getDeclaredMethod("start",  new Class[] { Method.class });
			// 反射执行start方法
			start.invoke(this.proxy, start );
			//执行要处理对象的原本方法   
            result = method.invoke(this.delegate, args); 
            // 反射得到操作者的end方法
			Method end = clazz.getDeclaredMethod("end",  new Class[] { Method.class });
			// 反射执行end方法
			end.invoke(this.proxy, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
