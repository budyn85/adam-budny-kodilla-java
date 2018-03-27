package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        // Given
        int[] numbers = new int[20];

        // When
        numbers[0]=12;
        numbers[1]=23;
        numbers[2]=18;
        numbers[3]=2;
        numbers[4]=121;
        numbers[5]=452;
        numbers[6]=459;
        numbers[7]=123;
        numbers[8]=857;
        numbers[9]=452;
        numbers[10]=12;
        numbers[11]=23;
        numbers[12]=18;
        numbers[13]=2;
        numbers[14]=121;
        numbers[15]=42;
        numbers[16]=459;
        numbers[17]=123;
        numbers[18]=857;
        numbers[19]=452;

        double functionAverage=ArrayOperations.getAverage( numbers);

        //Then
        Assert.assertEquals(231.4, functionAverage,0);
    }
}

