package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static void intro(){
        System.out.println("Welcome to RPS GAME:)");
    }
    public static String getUserName(){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter your name: ");
            String s=scanner.nextLine();
            if(s.length()<2){
                System.out.println("Name too short");
            }else{
                return s;
            }
        }
    }

    public static int getNumOfRounds() {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine();
            int n = 0;
            try {
                n = Integer.parseInt(s);
                if (n<=0){
                    System.out.println("Number must be greater than 0!!!");
                }else{
                    return n;
                }
            } catch (Exception e) {
                System.out.println("Wrong number!!!");
            }
        }
    }

    public static Choices getHumanChoice() {
        return Choices.ROCK;
        // brakuje wyborow
    }

    public static void showResults(int humanScore, int computerScore, Score score) {
        if(score==Score.HUMAN){
            System.out.println("Human wins!!!");
        }else if(score==Score.COMPUTER){
            System.out.println("Computer wins!!!");
        }else{
            System.out.println("Nobody wins");
        }
        System.out.println("Human score: "+humanScore);
        System.out.println("Computer score: "+computerScore);
    }
}
