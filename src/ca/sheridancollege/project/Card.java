/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
/**
 * Represents a playing card.
 */
public class Card implements Comparable<Card> {
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(11), QUEEN(12), KING(13), ACE(14);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private final Suit suit;
    private final Rank rank;

    /**
     * Constructs a new Card.
     * @param suit The suit of the card.
     * @param rank The rank of the card.
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    /**
     * Compares this card with another card for order.
     * @param other The card to compare with.
     * @return A negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card.
     */
    @Override
    public int compareTo(Card other) {
        // Compare by rank first
        int rankComparison = this.rank.compareTo(other.rank);
        if (rankComparison != 0) {
            return rankComparison;
        }
        // If ranks are equal, compare by suit
        return this.suit.compareTo(other.suit);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}