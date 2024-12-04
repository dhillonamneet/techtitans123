/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    protected String playerID;
    protected List<Card> hand;
    protected int roundScore; // Score for the current round
    protected int totalScore; // Total score across all rounds

    public Player(String playerID) {
        this.playerID = playerID;
        this.hand = new ArrayList<>();
        this.roundScore = 0;
        this.totalScore = 0;
    }

    public String getPlayerID() {
        return playerID;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setHand(List<Card> newHand) {
    this.hand = new ArrayList<>(newHand);
}

    public List<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }

    public abstract Card playCard();

    public abstract void passCards(List<Card> cardsToPass);

    public void addPoints(int points) {
        this.roundScore += points;
    }

    public void resetRoundScore() {
        this.roundScore = 0;
    }

    public void updateTotalScore() {
        this.totalScore += this.roundScore;
    }
    
    public boolean isValidPlay(Card card, Card.Suit leadSuit) {
    if (leadSuit == null) {
        // First play of the trick
        return true;
    }
    if (card.getSuit() == leadSuit) {
        return true;
    }
    // Check if player has any cards of the lead suit
    for (Card c : hand) {
        if (c.getSuit() == leadSuit) {
            return false;
        }
    }
    return true;
}
}