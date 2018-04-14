package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    public void testTaskAdd(){
        //Given
        board.getToDoList().addTask("ToDoTask");
        board.getInProgressList().addTask("InProgressTask");
        board.getDoneList().addTask("DoneTask");
        //Then
        String toDoTask=board.getToDoList().getTask(0);
        String inProgressTask=board.getInProgressList().getTask(0);
        String doneTask=board.getDoneList().getTask(0);
        //When
        Assert.assertEquals(toDoTask,"ToDoTask");
        Assert.assertEquals(inProgressTask,"InProgressTask");
        Assert.assertEquals(doneTask,"DoneTask");
}
}
