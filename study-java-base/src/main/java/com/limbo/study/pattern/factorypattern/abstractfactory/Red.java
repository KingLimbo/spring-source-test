package com.limbo.study.pattern.factorypattern.abstractfactory;

/**
 * 红色
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class Red implements Color {
    /**
     * 颜色填充
     */
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
