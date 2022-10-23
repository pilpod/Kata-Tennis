package com.pilpod.kata.tennis;

public class Player {
    
    boolean service;
    int points;

    public Player() {
    }

    public int getPoints() {
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

    public void winsPoint() {

        int[] pointsList = {0,15,30,40};

        for (int i = 0; i < pointsList.length; i++) {
            if (this.points == pointsList[i]) {
                i++;
                this.points = pointsList[i];
                break;
            }
        }
    }

}
