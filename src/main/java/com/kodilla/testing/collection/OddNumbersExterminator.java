package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        int eachValue = 0;
        for (int i = 0; i < numbers.size(); i++) {
            eachValue = numbers.get(i);
            if (eachValue % 2 == 0) {
                evenNumbers.add(eachValue);
            }
        }
        return evenNumbers;
    }
}