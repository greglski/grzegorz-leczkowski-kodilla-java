package com.kodilla.patterns2.observer.homework;

import static java.util.Optional.ofNullable;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Trainee trainee) {
        String lastTask = ofNullable(trainee.getTasks().get(trainee.getTasks().size()-1)).orElse("Any task to evaluate");
        System.out.println("Hi " + mentorName + "!\n" +
                "New task to evaluate from " + trainee.getTraineeName() + "\n" +
                "Task to evaluate: " + lastTask + "\n" +
                "Total number of tasks: " + trainee.getTasks().size() + "\n");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
