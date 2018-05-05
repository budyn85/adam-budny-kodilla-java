package com.kodilla.hibernate3.tasklist.dao;

import com.kodilla.hibernate3.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "ada";
    private static final String INFO = "Excercise 13.2";
    private static final String TEST = "Test: TaskList";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(INFO, TEST);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals(id, readTaskList.getId());
        //CleanUp
        taskListDao.delete(id);
    }
}


