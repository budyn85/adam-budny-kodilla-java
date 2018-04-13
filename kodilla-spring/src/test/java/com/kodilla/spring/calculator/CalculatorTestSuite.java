package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        double a=12.4;
        double b=3.5;
        //When
        double val1=calculator.add(a,b);
        double val2=calculator.sub(a,b);
        double val3=calculator.mul(a,b);
        double val4=calculator.div(a,b);
        //Then
        Assert.assertEquals(15.9,val1,0.0001);
        Assert.assertEquals(8.9,val2,0.001);
        Assert.assertEquals(43.4,val3,0.001);
        Assert.assertEquals(3.5,val4,0.05);
        }
}
