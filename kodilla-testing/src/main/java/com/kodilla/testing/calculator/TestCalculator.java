package com.kodilla.testing.calculator;

public class TestCalculator {
    public static void main(String[]args){
        Calculator basicCalculator = new Calculator();
        int addResult;
        int substractResult;
        addResult = basicCalculator.add(10,5);
        substractResult = basicCalculator.substract(10,5);

        if (addResult==15){
            System.out.println("Add test ok");
        }else{
            System.out.println("Error!");
        }

        if (substractResult==5) {
            System.out.println("Substract test ok");
        }else{
            System.out.println("Substract error!");
        }
    }
}
