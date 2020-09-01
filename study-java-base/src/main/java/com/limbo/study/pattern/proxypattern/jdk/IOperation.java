package com.limbo.study.pattern.proxypattern.jdk;

import java.lang.reflect.Method;

/**
 * 操作类接口
 *
 * @author LF
 */
public interface IOperation {

    /**
     * 开始方法
     *
     * @param method
     */
    void start(Method method);

    /**
     * 结束方法
     *
     * @param method
     */
    void end(Method method);
}
