package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 园形
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class Circle implements Shape {
    /**
     * 画图形
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
