package com.kodilla.testing.shape;


public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "circle";

    }

    @Override
    public int getField() {
        return 5;
    }
}
