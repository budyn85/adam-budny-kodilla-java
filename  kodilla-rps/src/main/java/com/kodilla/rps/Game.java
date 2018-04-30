package com.kodilla.rps;

public class Game {
    private String username;
    private int numOfRounds;
    private int humanScore=0;
    private int computerScore=0;

    public void playGame(){
        UserDialogs.intro();
        username=UserDialogs.getUserName();
        numOfRounds=UserDialogs.getNumOfRounds();
        while (humanScore<numOfRounds&&computerScore<numOfRounds){
            Choices humanChoice= UserDialogs.getHumanChoice();
            Computer computer=new Computer();
            Choices computerChoice=computer.getChoice();
            System.out.println("Computer choice was: "+computerChoice);
            Score score=resolveWinner(humanChoice,computerChoice);
            if (score==Score.HUMAN){
                humanScore++;
            }else if(score==Score.COMPUTER){
                computerScore++;
            }
            UserDialogs.showResults(humanScore,computerScore,score);
        }
        System.out.println("Results:"+"[Human score: "+humanScore+"]"+" "+"["+"Computer score: "+computerScore+"]");
    }

    private Score resolveWinner(Choices humanChoice, Choices computerChoice) {
        return Score.HUMAN;
        //dodac brakujace implementacje
    }
}
