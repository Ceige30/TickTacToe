package com.company;
import java.util.*;
public class Main {
//http://www.poll-maker.com/poll924782x770F468E-38
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String filler [][] = {{" "," "," "},
                              {" "," "," "},
                              {" "," "," "}};
        String row1 = "     |     |     \n"+
                      "  "+filler[0][0]+"  |  "+filler[0][1]+"  |  "+filler[0][2]+"  \n"+
                      "_____|_____|_____";
        String row2 = "     |     |     \n"+
                      "  "+filler[1][0]+"  |  "+filler[1][1]+"  |  "+filler[1][2]+"  \n"+
                      "_____|_____|_____";
        String row3 = "     |     |     \n"+
                      "  "+filler[0][0]+"  |  "+filler[0][1]+"  |  "+filler[0][2]+"  \n"+
                      "     |     |     ";
        boolean choice;
        String answer = "";
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
     System.out.println("Hello and welcome to Tic Tac Toe would you like the game to be player vs. player, player vs. computer, or computer vs. computer");
     System.out.println("Please type pvp to have player vs. player pvc for player vs. computer and cvc for computer vs. computer");
        while(choice = true){
            answer = sc.nextLine();
            System.out.println(answer);
            if(answer.equals("pvp")) {
                choice = true;
            }
            else if(answer.equals("pvc"))
                choice = true;
            else if(answer.equals("cvc"))
                choice = true;
            System.out.println("done loop");
        }
        System.out.println("done");
    }
}