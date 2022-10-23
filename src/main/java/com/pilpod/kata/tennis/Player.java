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
        if (this.points == 0) {
            this.points = 15;
            return;
        }

        if (this.points == 15) {
            this.points = 30;
            return;
        }

        if (this.points == 30) {
            this.points = 40;
            return;
        }
    }

}
