package com.pilpod.kata.tennis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    Player player;
    Player opponent;

    @BeforeEach
    public void setUp() {
        this.player = new Player();
        this.opponent = new Player();
    }

    @Test
    public void test_player_has_service() {
        player.setService(true);
        boolean result = player.hasService();
        assertEquals(true, result);
    }

    @Test
    public void test_player_has_0_points_when_init_set() {
        int points = player.getPoints();
        assertEquals(0, points);
    }

    @Test
    public void test_player_has_0_points_and_wins_next_point_now_has_15_points() {
        player.winsPoint(opponent);
        assertEquals(15, player.getPoints());
    }
    
    @Test
    public void test_player_has_15_points_and_wins_next_point_now_has_30_points() {
        player.setPoints(15);
        player.winsPoint(opponent);
        assertEquals(30, player.getPoints());
    }

    @Test
    public void test_player_has_30_points_and_wins_next_point_now_has_40_points() {
        player.setPoints(30);
        player.winsPoint(opponent);
        assertEquals(40, player.getPoints());
    }
}
