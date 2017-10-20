package com.kodilla.checkers;

public class CheckersMain {
    public static void main (String[] args) throws java.lang.Exception
    {
        Board board = new Board();
        /*for(int i=0; i<10; i++) {
            System.out.println(board.row.get(i).get(0) + " | " +
                    board.row.get(i).get(1) + " | " +
                    board.row.get(i).get(2) + " | " +
                    board.row.get(i).get(3) + " | " +
                    board.row.get(i).get(4) + " | " +
                    board.row.get(i).get(5) + " | " +
                    board.row.get(i).get(6) + " | " +
                    board.row.get(i).get(7) + " | " +
                    board.row.get(i).get(8) + " | " +
                    board.row.get(i).get(9));
        }
        System.out.println();*/

        board.setFigure("P", "W", 0, 9);
        board.setFigure("P", "W", 0, 5);
        board.setFigure("P", "W", 2, 0);

        for(int i=0; i<10; i++) {
            System.out.println(board.row.get(i).get(0) + " | " +
                    board.row.get(i).get(1) + " | " +
                    board.row.get(i).get(2) + " | " +
                    board.row.get(i).get(3) + " | " +
                    board.row.get(i).get(4) + " | " +
                    board.row.get(i).get(5) + " | " +
                    board.row.get(i).get(6) + " | " +
                    board.row.get(i).get(7) + " | " +
                    board.row.get(i).get(8) + " | " +
                    board.row.get(i).get(9));
        }
    }
}
