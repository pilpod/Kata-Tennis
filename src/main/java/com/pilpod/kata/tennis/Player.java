package com.pilpod.kata.tennis;

public class Player {
    
    boolean service;
    boolean winSet;
    Integer points = 0;
    String advantage;
    private String name;

    public Player() {
        this.winSet = false;
    }

    public Player(String name) {
        this.name = name;
        this.winSet = false;
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean hasService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    private void setWinSet(boolean winSet) {
        this.winSet = winSet;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public void winsPoint(Player opponent) {

        int[] pointsList = {0,15,30,40};

        for (int i = 0; i < pointsList.length; i++) {

            boolean opponentHasAdvantage = opponent.advantage == "A";
            boolean playerWinsSet = (this.points == 40 && opponent.points < 40) || this.advantage == "A";
            boolean playerHas40Points = this.points == 40;
            boolean changeScorePoints = this.points == pointsList[i];

            if (opponentHasAdvantage) {
                opponent.loseAdvantage();
                break;
            }

            if (playerWinsSet) {
                setPoints(0);
                opponent.setPoints(0);
                setAdvantage(null);
                setWinSet(true);
                opponent.setWinSet(false);
                break;
            }

            if (playerHas40Points) {
                setAdvantage("A");
                break;
            }

            if (changeScorePoints) {
                i++;
                setPoints(pointsList[i]);
                break;
            }
        }
    }

    public void loseAdvantage() {
        this.advantage = null;
    }

}
