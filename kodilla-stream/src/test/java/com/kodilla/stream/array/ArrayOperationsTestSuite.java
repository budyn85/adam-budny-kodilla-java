package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        // Given
        List<Integer> numbers = new ArrayList<>();

        // When
        numbers.add(12);
        numbers.add(23);
        numbers.add(18);
        numbers.add(2);
        numbers.add(121);
        numbers.add(452);
        numbers.add(459);
        numbers.add(123);
        numbers.add(857);
        numbers.add(452);

        double functionAverage=ArrayOperations.getAverage(int[] numbers);

        //Then
        Assert.assertEquals(251.9, functionAverage);
    }
    }
}
