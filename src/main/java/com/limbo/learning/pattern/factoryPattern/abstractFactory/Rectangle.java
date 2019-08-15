package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 长方形
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class Rectangle implements Shape {

    /**
     * 画图形
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
