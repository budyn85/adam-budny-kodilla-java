package com.kodilla.testing.wheather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WheatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WheaterForecast weatherForecast = new WheaterForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}