package com.pilpod.kata.tennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    Player playerOne;
    Player playerTwo;

    @BeforeEach
    public void setUp() {
        this.playerOne = new Player();
        this.playerTwo = new Player();
    }

    @Test
    public void test_when_init_set_score_is_0_0() {
        Game game = new Game(playerOne,playerTwo);
        String score = game.score();
        assertEquals("0:0", score);
    }

    @Test
    public void test_game_have_two_players_and_score_is_0_0() {
        Game game = new Game(playerOne,playerTwo);
        String score = game.score();
        assertEquals("0:0", score);
    }

    @Test
    public void test_score_is_0_0_player_one_make_point_15_0() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.winsPoint(playerTwo);
        String score = game.score();
        assertEquals("15:0", score);
    }

    @Test
    public void test_score_is_15_0_player_two_make_point_15_15() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.setPoints(15);
        playerTwo.winsPoint(playerOne);
        String score = game.score();
        assertEquals("15:15", score);
    }

    @Test
    public void test_score_is_15_15_receiver_wins_point_score_15_30() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.setPoints(15);
        playerTwo.setPoints(15);
        playerTwo.winsPoint(playerOne);
        String score = game.score();
        assertEquals("15:30", score);
    }

    @Test
    public void test_score_is_30_30_the_server_wins_point_40_30() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.setPoints(30);
        playerTwo.setPoints(30);
        playerOne.winsPoint(playerTwo);
        String score = game.score();
        assertEquals("40:30", score);
    }

    // Deuce and Advantage are Scored Correctly

    @Test
    public void test_score_is_40_40_receiver_wins_point_40_A() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.setPoints(40);
        playerTwo.setPoints(40);
        playerTwo.winsPoint(playerOne);
        String score = game.score();
        assertEquals("40:A", score);
    }

    @Test
    public void test_score_is_A_40_receiver_wins_point_40_40() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.setPoints(40);
        playerOne.setAdvantage("A");
        playerTwo.setPoints(40);
        playerTwo.winsPoint(playerOne);
        String score = game.score();
        assertEquals("40:40", score);
    }

    @Test
    public void test_score_is_40_A_receiver_wins_point_40_40() {
        Game game = new Game(playerOne, playerTwo);
        playerOne.setPoints(40);
        playerTwo.setPoints(40);
        playerTwo.setAdvantage("A");
        playerOne.winsPoint(playerTwo);
        String score = game.score();
        assertEquals("40:40", score);
    }

}
