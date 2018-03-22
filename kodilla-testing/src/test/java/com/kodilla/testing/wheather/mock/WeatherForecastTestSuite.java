package com.kodilla.testing.wheather.mock;


import com.kodilla.testing.wheather.stub.Temperatures;
import com.kodilla.testing.wheather.stub.WheaterForecast;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

    public class WeatherForecastTestSuite {
        @Test
        public void testCalculateForecastWithMock() {
            //Given
            Temperatures temperaturesMock = mock(Temperatures.class);
            WheaterForecast weatherForecast = new WheaterForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assert.assertEquals(5, quantityOfSensors);
        }
    }
