package com.pilpod.kata.tennis;

public class Game {

    Player playerOne;
    Player playerTwo;
    String score;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String score() {

        if (playerOne.getPoints() <= 40 && 
            playerTwo.getPoints() <= 40) {
            this.score = String.format("%d:%d", playerOne.getPoints(), playerTwo.getPoints());
        }

        if (playerOne.getAdvantage() == "A") {
            this.score = String.format("%s:%s", playerOne.getAdvantage(), playerTwo.getPoints());
        }

        if (playerTwo.getAdvantage() == "A") {
            this.score = String.format("%s:%s", playerOne.getPoints(), playerTwo.getAdvantage());
        }

        
        return this.score;
    }

}
