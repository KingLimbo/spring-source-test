package com.limbo.learning.pattern.factoryPattern.abstractFactory;

/**
 * 形状工厂
 *
 * @author LF.LIMBO
 * @version 2019/08/15
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * 获取外形
     *
     * @return
     */
    @Override
    protected Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
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
        return null;
    }
}
