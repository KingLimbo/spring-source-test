package com.limbo.test.aop.jdk;

import java.lang.reflect.Method;

/**
 * 日志操作类
 * @author LF
 *
 */
public class LoggerOperation implements IOperation{

	/**
	 * 开始日志
	 * @param method
	 */
	public void start(Method method) {
		Logger.logging(Level.INFO, method.getName() + " Method Start!");
	}

	/**
	 * 结束日志
	 * @param method
	 */
	public void end(Method method) {
		Logger.logging(Level.DEBUGE, method.getName() + " Method end!");
	} 
}
