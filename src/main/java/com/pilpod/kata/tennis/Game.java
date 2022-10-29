package com.pilpod.kata.tennis;

import java.util.ArrayList;

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

        ArrayList<Player> players = new ArrayList<>();
        players.add(playerOne);
        players.add(playerTwo);

        for (Player player : players) {
            if (player.winSet) {
                Player winner = playerWinsSet(player);
                this.score = String.format("%s wins", winner.getName());
                return this.score;
            }
        }

        Object scorePlayerOne = retrievePlayerOneScore();
        Object scorePlayerTwo = retrievePlayerTwoScore();
        this.score = String.format("%s:%s", scorePlayerOne, scorePlayerTwo);
        return this.score;
    }

    public Object retrievePlayerOneScore() {

        if (playerOne.getAdvantage() == "A") {
            return playerOne.getAdvantage();
        }

        return playerOne.getPoints();
    }

    public Object retrievePlayerTwoScore() {
        if (playerTwo.getAdvantage() == "A") {
            return playerTwo.getAdvantage();
        }

        return playerTwo.getPoints();
    }

    public Player playerWinsSet(Player player) {
        if (player.winSet)
            return player;
        return null;
    }
}
