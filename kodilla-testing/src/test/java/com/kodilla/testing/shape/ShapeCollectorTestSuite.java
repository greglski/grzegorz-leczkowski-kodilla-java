package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of ShapeCollector tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All of ShapeCollector tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute of ShapeCollector test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1,1);

        // When
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(1, shapeCollector.getFigures().size());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1,1);

        // When
        boolean result = shapeCollector.removeFigure(triangle);

        // Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1,1);
        shapeCollector.addFigure(triangle);

        // When
        boolean result = shapeCollector.removeFigure(triangle);

        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFigures().size());
    }

    @Test
    public void testGetFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1,1);
        shapeCollector.addFigure(triangle);

        // When
        Shape result = shapeCollector.getFigure(0);

        // Then
        Assert.assertEquals(triangle, result);
    }
}
