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
        this.score = String.format("%d:%d", playerOne.getPoints(),playerTwo.getPoints());
        return this.score;
    }

}
