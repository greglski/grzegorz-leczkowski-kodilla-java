package com.kodilla.checkers;

import java.util.ArrayList;

public class Board {
    ArrayList<Figure> col = new ArrayList<>();
    ArrayList<ArrayList<Figure>> row = new ArrayList<>();
    public Board() {
        for(int i=0; i<10; i++) {
            col.add(new Figure());
        }
        for(int k=0; k<10; k++) {
            row.add(new ArrayList<Figure>(col));
        }
    }
    public void setFigure(String type, String color, int x, int y) {
        Figure figure = new Figure(type, color);
        this.row.get(y).remove(x);
        this.row.get(y).add(x, figure);

    }
}
