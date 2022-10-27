package com.pilpod.kata.tennis;

public class Player {
    
    boolean service;
    Integer points = 0;
    String advantage;

    public Player() {
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

    public void winsPoint() {

        int[] pointsList = {0,15,30,40};

        for (int i = 0; i < pointsList.length; i++) {

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

}
