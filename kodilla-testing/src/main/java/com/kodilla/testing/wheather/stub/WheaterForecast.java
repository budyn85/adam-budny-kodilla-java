package com.kodilla.testing.wheather.stub;

import java.util.HashMap;
import java.util.Map;

public class WheaterForecast {
    Temperatures temperatures;

    public WheaterForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public HashMap<Integer,Double> calculateForecast(){
        HashMap<Integer,Double> resultMap = new HashMap<Integer, Double>();

        for(Map.Entry<Integer,Double> temperature:
                temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(),temperature.getValue());
        }
        return resultMap;
    }
}
