
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

public class Trick {
    private final List<Card> cards;
    private final List<Player> players;
    
    public Trick() {
        this.cards = new ArrayList<>();
        this.players = new ArrayList<>();
    }
    
    public void addCard(Card card, Player player) {
        cards.add(card);
        players.add(player);
    }

    public Player getWinner() {
        if (cards.isEmpty()) return null;

        Card leadingCard = cards.get(0);
        Card.Suit leadingSuit = leadingCard.getSuit();
        Card highestCard = leadingCard;
        Player trickWinner = players.get(0);

        for (int i = 1; i < cards.size(); i++) {
            Card card = cards.get(i);
            Player player = players.get(i);

            if (card.getSuit() == leadingSuit) {
                if (card.compareTo(highestCard) > 0) {
                    highestCard = card;
                    trickWinner = player;
                }
            }
        }

        return trickWinner;
    }

    public int calculatePoints() {
        int totalPoints = 0;

        for (Card card : cards) {
            if (card.getSuit() == Card.Suit.HEARTS) {
                totalPoints += 1;
            } else if (card.getRank() == Card.Rank.QUEEN && card.getSuit() == Card.Suit.SPADES) {
                totalPoints += 13;
            }
        }

        return totalPoints;
    }
}
