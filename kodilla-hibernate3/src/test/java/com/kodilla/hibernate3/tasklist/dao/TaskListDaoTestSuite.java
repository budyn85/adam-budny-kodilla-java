package com.kodilla.hibernate3.tasklist.dao;

import com.kodilla.hibernate3.task.Task;
import com.kodilla.hibernate3.task.TaskFinancialDetails;
import com.kodilla.hibernate3.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

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
    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        final Task task = new Task("Test: Learn Hibernate", 14);
        final Task task2 = new Task("Test: Write some entities", 3);
        final TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(20), false);
        final TaskFinancialDetails taskFinancialDetails2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(taskFinancialDetails);
        task2.setTaskFinancialDetails(taskFinancialDetails2);
        final TaskList taskList = new TaskList("ToDo", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        //Then
        assertThat(taskList.getId()).isNotEqualTo(0);
        //Clean Up
        taskListDao.delete(taskList.getId());
    }
}


