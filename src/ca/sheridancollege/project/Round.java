
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author dhill
 */
import java.util.ArrayList;
import java.util.List;

public class Round {
    private final int roundNumber;
    private final List<Trick> tricks;
    private final List<Player> players; // Add this line

    public Round(int roundNumber, List<Player> players) { // Modify constructor
        this.roundNumber = roundNumber;
        this.tricks = new ArrayList<>();
        this.players = players; // Add this line
    }

    public void startRound() {
        System.out.println("Round " + roundNumber + " started.");
        // Additional round start logic
    }

    public void endRound() {
        System.out.println("Round " + roundNumber + " ended.");
        // Additional round end logic
    }

    public Player determineRoundWinner() {
        Player roundWinner = null;
        int lowestScore = Integer.MAX_VALUE;

        for (Player player : players) {
            int playerScore = player.getRoundScore(); // Use getRoundScore() instead of getScore()
            if (playerScore < lowestScore) {
                lowestScore = playerScore;
                roundWinner = player;
            }
        }

        return roundWinner;
    }

    public void addTrick(Trick trick) {
        tricks.add(trick);
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public int getRoundNumber() {
        return roundNumber;
    }
}
