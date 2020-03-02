package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 工厂生成器类
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class FactoryProducer {
    /**
     * 获取工厂
     *
     * @param choice
     * @return
     */
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
