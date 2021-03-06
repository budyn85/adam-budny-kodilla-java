package com.kodilla.hibernate3.tasklist.dao;

import com.kodilla.hibernate3.task.Task;
import com.kodilla.hibernate3.task.TaskFinancialDetails;
import com.kodilla.hibernate3.task.dao.TaskDao;
import com.kodilla.hibernate3.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Autowired
    private TaskDao taskDao;
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
    @Test
    public void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks= taskDao.retrieveTasksWithDurationLongerThan(6);

        //Then
        try {
            Assert.assertEquals(1, longTasks.size());
            Assert.assertEquals(3, shortTasks.size());
            Assert.assertEquals(3, enoughTimeTasks.size());
            Assert.assertEquals(2,durationLongerThanTasks.size());
        } finally {
            //CleanUp
            taskListDao.delete(id);
        }
    }
}


