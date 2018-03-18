package com.kodilla.testing.weather.stub;

import com.kodilla.testing.wheather.stub.Temperatures;
import com.kodilla.testing.wheather.stub.TemperaturesStub;
import com.kodilla.testing.wheather.stub.WheaterForecast;
import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
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