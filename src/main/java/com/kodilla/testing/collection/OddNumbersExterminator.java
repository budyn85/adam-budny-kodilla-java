package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers){
        int eachValue=0;
        for (int i=0; i<numbers.size();i++){
            eachValue=numbers.get(i);
            if (eachValue %2==0){
                System.out.println(eachValue);
            }
        }
    }
}

