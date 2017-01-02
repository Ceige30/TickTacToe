package com.company;
import java.util.*;

public class Match {

    public static int isMatching (String [][] board) {

        int match = 0;

        for (int i = 0; i <= 2; i++) {
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                if (board[0][i].equals("X")) {
                    match = 1;
                } else if (board[0][i].equals("O")) {
                    match = 2;
                }
                break;
            }
        }

        if (match == 0) {
            if (board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) {
                if (board[0][0].equals("X")) {
                    match = 1;
                } else if (board[0][0].equals("O")) {
                    match = 2;
                }
            }
            if (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) {
                if (board[1][0].equals("X")) {
                    match = 1;
                } else if (board[1][0].equals("O")) {
                    match = 2;
                }
            }
            if (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) {
                if (board[2][0].equals("X")) {
                    match = 1;
                } else if (board[2][0].equals("O")) {
                    match = 2;
                }
            }
        }

        if (match == 0) {
            if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                if (board[0][0].equals("X")) {
                    match = 1;
                } else if (board[0][0].equals("O")) {
                    match = 2;
                }
            }
        }

        if (match == 0) {
            if (board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])) {
                if (board[2][0].equals("X")) {
                    match = 1;
                } else if (board[2][0].equals("O")) {
                    match = 2;
                }
            }
        }
        return match;
    }

    public static boolean tieGame (String [][] board) {
        int increment = 0;
        for (int j = 0; j < board.length; j++) {
            for (int k = 0; k < board[j].length; k++) {
                if (board[j][k].equals("-")) {
                    increment++;
                    break;
                }
            }
            if (increment != 0) {
                break;
            }
        }
        if (increment == 0) {
            return true;
        } else {
            return false;
        }
    }

}