package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 正方形
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class Square implements Shape {
    /**
     * 画图形
     */
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
