package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factoryShopping = new TaskFactory();
        //When
        Task shopping = factoryShopping.makeTask("ShoppingTask");
        //Then
        Assert.assertEquals("Shop", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTaskExecute() {
        //Given
        TaskFactory factoryShopping = new TaskFactory();
        //When
        Task shopping = factoryShopping.makeTask("ShoppingTask");
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factoryPainting = new TaskFactory();
        //When
        Task painting = factoryPainting.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTaskExecute() {
        //Given
        TaskFactory factoryPainting = new TaskFactory();
        //When
        Task painting = factoryPainting.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertTrue(painting.isTaskExecuted());
    }


    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factoryDriving = new TaskFactory();
        //When
        Task driving = factoryDriving.makeTask(TaskFactory.DRIVING);
        DrivingTask drivingTask = new DrivingTask("Drive", "Home", "Bike");
        //Then
        Assert.assertEquals(drivingTask, driving);
        Assert.assertFalse(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTaskExecute() {
        //Given
        TaskFactory factoryDriving = new TaskFactory();
        //When
        Task driving = factoryDriving.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
