package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[]args){
        SecondChallange secondChallange = new SecondChallange();
        try {
            secondChallange.probablyIWillThrowException(3.0, 4.5);
        }catch (Exception b){
            System.out.println("Problem with method parameters.See boundary conditions");
        }
        finally {
            System.out.println("Don't worry!! My program is in progress with next task");
        }
    }
}
