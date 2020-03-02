package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 绿色
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class Green implements Color {
    /**
     * 颜色填充
     */
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
