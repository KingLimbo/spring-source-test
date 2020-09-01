package com.limbo.study.pattern.factorypattern.abstractfactory;

/**
 * 蓝色
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class Blue implements Color {
    /**
     * 颜色填充
     */
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
