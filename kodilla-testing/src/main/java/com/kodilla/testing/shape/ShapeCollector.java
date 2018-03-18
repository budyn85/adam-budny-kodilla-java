package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> figureNames = new ArrayList<>();

    public ArrayList<Shape> getFigureNames() {
        return figureNames;
    }

    public void addFigure(Shape shape){
         figureNames.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return figureNames.remove(shape);
    }
    public Shape getFigure(int n){
         return figureNames.get(1);
    }
}
