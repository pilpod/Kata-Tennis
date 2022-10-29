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

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public void winsPoint(Player opponent) {

        int[] pointsList = {0,15,30,40};

        for (int i = 0; i < pointsList.length; i++) {

            if (opponent.advantage == "A") {
                opponent.loseAdvantage();
                break;
            }

            if (this.advantage == "A") {
                this.points = 0;
                opponent.setPoints(0);
                this.advantage = null;
                this.winSet = true;
                opponent.winSet = false;
                break;
            }

            if (this.points == 40 && opponent.points < 40) {
                this.points = 0;
                opponent.setPoints(0);
                this.advantage = null;
                this.winSet = true;
                opponent.winSet = false;
                break;
            }

            if (this.points == 40) {
                this.advantage = "A";
                break;
            }

            if (this.points == pointsList[i]) {
                i++;
                this.points = pointsList[i];
                break;
            }
        }
    }

    public void loseAdvantage() {
        this.advantage = null;
    }

}
