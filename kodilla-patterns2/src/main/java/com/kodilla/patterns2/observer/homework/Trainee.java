package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
    private Observer observer;
    private final String traineeName;
    private final List<String> tasks;

    public Trainee(String traineeName) {
        tasks = new ArrayList<>();
        this.traineeName = traineeName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver() {
        observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observer = null;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
