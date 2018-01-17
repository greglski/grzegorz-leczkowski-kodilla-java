package com.kodilla.checkers;

public class Figure {
    public final static Figure PAWNWHITE = new Figure("P","W");
    public final static Figure PAWNBLACK = new Figure("P","B");
    public final static Figure QEENWHITE = new Figure("Q","W");
    public final static Figure QEENBLACK = new Figure("Q","B");
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
