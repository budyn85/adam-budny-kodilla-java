package com.kodilla.testing.weather.mock;


import com.kodilla.testing.wheather.stub.Temperatures;
import org.junit.Test;
import static org.mockito.Mockito.mock;

    public class WeatherForecastTestSuite {
        @Test
        public void testCalculateForecastWithMock() {
            //Given
            Temperatures temperaturesMock = mock(Temperatures.class);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assert.assertEquals(5, quantityOfSensors);
        }
    }
