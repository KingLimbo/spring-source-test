package com.tartarust.aop;

/**
 * 代理类
 * @author LF
 *
 */
public class AbstractDefined implements IAbstractDefined {

	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + ": save message");
	}

}
