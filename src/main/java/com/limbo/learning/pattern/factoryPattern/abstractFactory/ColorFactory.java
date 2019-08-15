package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 颜色工厂
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class ColorFactory extends AbstractFactory {
    /**
     * 获取外形
     *
     * @param shapeType
     * @return
     */
    @Override
    protected Shape getShape(String shapeType) {
        return null;
    }

    /**
     * 获取颜色
     *
     * @param colorType
     * @return
     */
    @Override
    protected Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
