package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory=new TaskFactory();
        //When
        Task drivingTask=taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Italy sunshine",drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
        Assert.assertEquals("Task to execute Italy sunshine Turyn,Roma,Neapol Porsche GT3",drivingTask.executeTask());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory=new TaskFactory();
        //When
        Task paintingTask=taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("LagoonBlue ",paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
        Assert.assertEquals("Task to execute LagoonBlue  Ral5010 Car",paintingTask.executeTask());
    }
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory=new TaskFactory();
        //When
        Task shoppingTask=taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Friday shopping",shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        Assert.assertEquals("Task to execute Friday shopping Jeans,T-shirt 2.0",shoppingTask.executeTask());
    }
}
