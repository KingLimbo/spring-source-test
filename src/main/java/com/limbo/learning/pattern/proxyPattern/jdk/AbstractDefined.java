package com.limbo.learning.pattern.proxyPattern.jdk;

/**
 * 代理类
 *
 * @author LF
 */
public class AbstractDefined implements IAbstractDefined {

    public void save(String name) {
        System.out.println(name + ": save message");
    }

}
