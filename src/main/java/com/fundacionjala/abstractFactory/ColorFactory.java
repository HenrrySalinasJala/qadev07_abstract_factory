package com.fundacionjala.abstractFactory;

import com.fundacionjala.abstractFactory.colors.Blue;
import com.fundacionjala.abstractFactory.colors.Green;
import com.fundacionjala.abstractFactory.colors.IColor;
import com.fundacionjala.abstractFactory.colors.Red;
import com.fundacionjala.abstractFactory.shapes.IShape;

/**
 * Created by HENRRY on 29/06/2016.
 */
public class ColorFactory extends AbstractFactory{
    
    IColor getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("green")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }
    IShape getShape(String shape) {
        return null;
    }
}
