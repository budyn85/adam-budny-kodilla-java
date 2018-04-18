package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logLogger(){
        Logger.getInstance().log("My first log");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String result=Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("My first log",result);
    }
}
