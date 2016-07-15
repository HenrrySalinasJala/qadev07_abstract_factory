package com.fundacionjala.abstractFactory;

import com.fundacionjala.abstractFactory.colors.IColor;
import com.fundacionjala.abstractFactory.shapes.IShape;

public class Main {
    public static void main(String[] args){
        AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
        IShape circle=shapeFactory.getShape("circle");
        circle.draw();
        AbstractFactory colorFactory=FactoryProducer.getFactory("color");
        IColor red=colorFactory.getColor("red");
        red.fill();
    }
}
