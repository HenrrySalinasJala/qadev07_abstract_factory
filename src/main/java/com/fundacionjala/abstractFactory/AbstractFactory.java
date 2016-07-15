package com.fundacionjala.abstractFactory;

import com.fundacionjala.abstractFactory.colors.IColor;
import com.fundacionjala.abstractFactory.shapes.IShape;

public abstract class AbstractFactory {
    abstract IColor getColor(String color);
    abstract IShape getShape(String shape);
}
