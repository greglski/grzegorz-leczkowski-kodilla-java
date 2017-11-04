package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "ShoppingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String DRIVING = "DrivingTask";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shop", "Cola", 0.5);
            case PAINTING:
                return new PaintingTask("Paint", "White", "Ceiling");
            case DRIVING:
                return new DrivingTask("Drive", "Home", "Bike");
            default:
                return null;
        }
    }
}
