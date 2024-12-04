
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jassk
 */

import java.util.HashMap;
import java.util.Map;

public class Score {
    private final Map<Player, Integer> playerScores;

    public Score() {
        playerScores = new HashMap<>();
    }

    public void updateScore(Player player, int score) {
        playerScores.put(player, playerScores.getOrDefault(player, 0) + score);
    }

    public Player getWinner() {
        return playerScores.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}