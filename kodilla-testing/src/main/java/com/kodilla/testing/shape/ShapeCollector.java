package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> figureNames = new ArrayList<>();

    public ShapeCollector
    public void addFigure(Shape shape){
        return figureNames.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return figureNames.remove(shape);
    }
    public void getFigure(int n){
       return  figureNames.get(n);
    }
    public int showFigures(){
       return figureNames.size();
    }
}
