
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author dhill
 */
import java.util.List;
import java.util.Random;

public class AIPlayer extends Player {
    private final Random random;

    public AIPlayer(String playerID) {
        super(playerID);
        random = new Random();
    }

    @Override
    public Card playCard() {
        int index = random.nextInt(hand.size());
        Card card = hand.get(index);
        removeCardFromHand(card);
        System.out.println(playerID + " played: " + card);
        return card;
    }

    @Override
    public void passCards(List<Card> cardsToPass) {
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(hand.size());
            Card card = hand.get(index);
            cardsToPass.add(card);
            removeCardFromHand(card);
        }
    }
}
