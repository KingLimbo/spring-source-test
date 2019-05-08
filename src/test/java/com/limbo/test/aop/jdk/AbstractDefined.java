package com.limbo.test.aop.jdk;

/**
 * 代理类
 * @author LF
 *
 */
public class AbstractDefined implements IAbstractDefined {

	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + ": save message");
	}

}
