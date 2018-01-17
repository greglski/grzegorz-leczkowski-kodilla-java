package com.kodilla.checkers;

import java.util.ArrayList;

public class Board {
    ArrayList<Figure> cols = new ArrayList<>();
    ArrayList<ArrayList<Figure>> rows = new ArrayList<>();

    /*public Board() {
        for(int i=0; i<10; i++) {
            cols.add(new Figure());
        }
        for(int k=0; k<10; k++) {
            rows.add(new ArrayList<Figure>(cols));
        }
    }*/


    public Board() {
        for (int k = 0; k < 10; k++) {
            if (k % 2 != 0) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        cols.add(i, Figure.PAWNWHITE);
                    } else {
                        cols.add(i, new Figure());
                    }
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        cols.add(new Figure());
                    } else {
                        cols.add(Figure.QEENBLACK);
                    }
                }
            }
            System.out.println(k);
            rows.add(new ArrayList<>(cols));
            cols.clear();
        }
    }

    public void setFigure(Figure figure, int column, int row) {
        int x = column - 1;
        int y = 10 - row;
        this.rows.get(y).remove(x);
        this.rows.get(y).add(x, figure);
    }

    public void moveFigure(int colFrom, int rowFrom, int colTo, int rowTo) {
        Figure figureFrom = this.rows.get(10 - rowFrom).get(colFrom - 1);
//        System.out.println(figureFrom);
        this.setFigure(figureFrom, colTo, rowTo);
        this.setFigure(new Figure(), colFrom, rowFrom);
    }

    public ArrayList<Figure> getCols() {
        return cols;
    }

    public ArrayList<ArrayList<Figure>> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        String boardString = "";
        for (int i = 0; i < 10; i++) {
            boardString +=
                    this.rows.get(i).get(0) + " | " +
                    this.rows.get(i).get(1) + " | " +
                    this.rows.get(i).get(2) + " | " +
                    this.rows.get(i).get(3) + " | " +
                    this.rows.get(i).get(4) + " | " +
                    this.rows.get(i).get(5) + " | " +
                    this.rows.get(i).get(6) + " | " +
                    this.rows.get(i).get(7) + " | " +
                    this.rows.get(i).get(8) + " | " +
                    this.rows.get(i).get(9) + "\n";
        }
        return boardString;
    }
}
