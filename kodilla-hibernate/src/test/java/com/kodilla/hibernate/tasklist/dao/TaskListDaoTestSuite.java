package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo", "Tasks to do");
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(name);
        //Then
        Assert.assertEquals(1, readTaskLists.size());
        //Clear
        int id = readTaskLists.get(0).getId();
        taskListDao.delete(id);
    }
}
