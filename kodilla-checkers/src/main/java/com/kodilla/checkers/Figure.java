package com.kodilla.checkers;

public class Figure {
    String type;
    String color;
    public Figure(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Figure() {
        this.type = ".";
        this.color = ".";
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return type + color;
    }
}
