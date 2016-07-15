package com.fundacionjala.abstractFactory;

import com.fundacionjala.abstractFactory.colors.IColor;
import com.fundacionjala.abstractFactory.shapes.Circle;
import com.fundacionjala.abstractFactory.shapes.IShape;
import com.fundacionjala.abstractFactory.shapes.Rectangle;
import com.fundacionjala.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory{
    
    IShape getShape(String shape) {
        if (shape==null){
            return null;
        }
        if (shape.equalsIgnoreCase("square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }

    IColor getColor(String color) {
        return null;
    }
}
