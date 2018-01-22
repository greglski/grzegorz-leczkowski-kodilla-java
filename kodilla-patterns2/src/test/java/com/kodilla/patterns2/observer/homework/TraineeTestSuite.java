package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class TraineeTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mentorJohn = new Mentor("John Mentor");
        Mentor mentorAndrew = new Mentor("Andrew Mentor");
        Trainee traineeAnn = new Trainee("Ann Trainee");
        Trainee traineeJulie = new Trainee("Julie Trainee");
        Trainee traineeChris = new Trainee("Chris Trainee");
        Trainee traineeJack = new Trainee("Jack Trainee");
        traineeAnn.registerObserver(mentorJohn);
        traineeJulie.registerObserver(mentorJohn);
        traineeJack.registerObserver(mentorAndrew);
        traineeChris.registerObserver(mentorAndrew);
        //When
        traineeAnn.addTask("Module 1");
        traineeAnn.addTask("Module 2");
        IntStream.rangeClosed(1, 3)
                .forEach(n -> traineeJulie.addTask("Module " + n));
        IntStream.rangeClosed(1, 2)
                .forEach(n -> traineeChris.addTask("Module " + n));
        IntStream.rangeClosed(1, 2)
                .forEach(n -> traineeJack.addTask("Module " + n));
        //Then
        assertEquals(5, mentorJohn.getUpdateCount());
        assertEquals(4, mentorAndrew.getUpdateCount());
    }
}
