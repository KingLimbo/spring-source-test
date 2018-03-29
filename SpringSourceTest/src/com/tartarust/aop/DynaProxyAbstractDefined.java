package com.tartarust.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 * @author LF
 *
 */
public class DynaProxyAbstractDefined implements InvocationHandler {

	/**
	 * 操作对象
	 */
	private Object proxy;
	
	/**
	 * 委托对象
	 */
	private Object delegate;
	
	/**
	 * 绑定委托对象，并返回代理类
	 * 
	 * @param delegate 委托对象
	 * @param proxy 操作对象
	 * @return
	 * @throws ClassNotFoundException
	 */
	public Object bind(Object delegate, Object proxy) throws ClassNotFoundException{
		// 操作对象
		this.proxy = proxy;
		// 委托对象
		this.delegate = delegate; 
		// 绑定该类实现的所有接口，取得代理类
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader()
				, this.delegate.getClass().getInterfaces(), this);
	}
	
	/**
	 * 反射执行方法
	 * 
	 * @param proxy 操作对象
	 * @param method 方法
	 * @param args 
	 * @return Object
	 * @throws Throwable
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 定义返回变量
		Object result = null;
		try {
			// 反射得到操作者实例
			Class clazz = this.proxy.getClass();
			// 反射得到操作者的start方法
			Method start = clazz.getDeclaredMethod("start",  new Class[] { Method.class });
			// 反射执行start方法
			start.invoke(this.proxy, start );
			// 执行要处理对象的原本方法   
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
