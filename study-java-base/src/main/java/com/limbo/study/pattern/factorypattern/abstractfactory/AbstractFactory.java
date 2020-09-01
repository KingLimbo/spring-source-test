package com.limbo.study.pattern.factorypattern.abstractfactory;

/**
 * 抽象工厂类
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public abstract class AbstractFactory {

    /**
     * 获取外形
     *
     * @return
     */
    protected abstract Shape getShape(String shapeType);

    /**
     * 获取颜色
     *
     * @return
     */
    protected abstract  Color getColor(String colorType);
}
