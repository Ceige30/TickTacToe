package com.company;
import java.util.*;

public class Main {
    //http://www.poll-maker.com/poll924782x770F468E-38
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playerTurn = true;
        boolean test = true;
        String gMode = "";

        System.out.println("Welcome to Tic Tac Toe");

        while (test) {
            System.out.println("What mode would you like to play?");
            System.out.println("Type pvp Player vs Player");
            System.out.println("Type pvc Player vs Computer");
            System.out.println("Type cvc Computer vs Computer");
            System.out.println("The first number input is for the row");
            System.out.println("The second number input is for the column");
            try {
                gMode = sc.next();
                gMode = gMode.toLowerCase();
                if (gMode.equals("pvp") || gMode.equals("pvc") || gMode.equals("cvc")) {
                    test = false;
                } else {
                    System.out.println("Number inputted is an invalid mode ID.");
                    System.out.println("Please input a valid mode ID.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Your input was not a number.");
                sc.next();
            }
        }

        if (gMode.equals("pvc")) {
            test = true;
        }

        Scanner sc2 = new Scanner(System.in);

        while (test) {
            System.out.println("Would you like to go first? Yes or No");
            String response = sc2.nextLine().toLowerCase();
            if (response.equals("yes")) {
                playerTurn = true;
                test = false;
            } else if (response.equals("no")) {
                playerTurn = false;
                test = false;
            } else {
                System.out.println("Please input a valid answer.");
            }
        }
        if (gMode.equals("pvp")) {
            System.out.println("There are 3 Rows and 3 Columns.");
            System.out.println("Rows 1-3 and Columns 1-3.");
            PvP.beginGame(true);
        } else if (gMode.equals("pvc")) {
            System.out.println("There are 3 Rows and 3 Columns.");
            System.out.println("Rows 1-3 and Columns 1-3.");
            PvC.beginGame(playerTurn);
        } else if (gMode.equals("cvc")){
            System.out.println("There are 3 Rows and 3 Columns.");
            System.out.println("Rows 1-3 and Columns 1-3.");
            CvC.beginGame(true);
        }
    }
}