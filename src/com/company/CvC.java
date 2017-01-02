package com.company;
import java.util.*;

public class CvC {

    public static void beginGame (boolean order) {
        boolean looping = true;
        int row;
        int column;
        String symbol;
        String [][] board = {{"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}};

        while (looping) {
            System.out.println("     |     |     \n"+
                    "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                    "_____|_____|_____");
            System.out.println("     |     |     \n"+
                    "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                    "_____|_____|_____");
            System.out.println("     |     |     \n"+
                    "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                    "     |     |     ");
            if (order) {
                System.out.println("It is the computer's turn.\n");

                symbol = "X";
                boolean confirming = true;
                while (confirming) {
                    int [] location = AI.getLocation(board, symbol);
                    row = location[0]; column = location[1];

                    if (board[row][column].equals("-")) {
                        board[row][column] = symbol;
                        confirming = false;
                    }
                }

                int match = Match.isMatching(board);
                boolean tie = Match.tieGame(board);

                if (match == 1 && !tie) {
                    System.out.println("Player 1 wins!\n");

                    System.out.println("     |     |     \n"+
                            "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                            "     |     |     ");

                    looping = false;
                } else if (match == 2 && !tie) {
                    System.out.println("Player 2 wins!\n");

                    System.out.println("     |     |     \n"+
                            "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                            "     |     |     ");

                    looping = false;
                } else if (match == 0 && !tie) {
                    if (order) {
                        order = false;
                    } else {
                        order = true;
                    }
                } else if (tie) {
                    System.out.println("Tie Game!\n");

                    System.out.println("     |     |     \n"+
                            "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                            "     |     |     ");

                    looping = false;
                }
            } else {
                System.out.println("It is the other computer's turn.\n");

                symbol = "O";
                boolean confirming = true;
                while (confirming) {
                    int [] location = AI.getLocation(board, symbol);
                    row = location[0]; column = location[1];

                    if (board[row][column].equals("-")) {
                        board[row][column] = symbol;
                        confirming = false;
                    }
                }


                int hasMatch = Match.isMatching(board);
                boolean tie = Match.tieGame(board);

                if (hasMatch == 1 && !tie) {
                    System.out.println("Player 1 wins!");

                    System.out.println("     |     |     \n"+
                            "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                            "     |     |     ");

                    looping = false;
                } else if (hasMatch == 2 && !tie) {
                    System.out.println("Player 2 wins!");

                    System.out.println("     |     |     \n"+
                            "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                            "     |     |     ");

                    looping = false;
                } else if (hasMatch == 0 && !tie) {
                    if (order) {
                        order = false;
                    } else {
                        order = true;
                    }
                } else if (tie) {
                    System.out.println("Tie Game!");

                    System.out.println("     |     |     \n"+
                            "  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  \n"+
                            "_____|_____|_____");
                    System.out.println("     |     |     \n"+
                            "  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  \n"+
                            "     |     |     ");

                    looping = false;
                }
            }

        }
        System.out.println("Game Over Please Click the Green Arrow to play Again");
    }
}
