
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jassk
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private final Scanner scanner;

    public HumanPlayer(String playerID) {
        super(playerID);
        scanner = new Scanner(System.in);
    }

    @Override
    public Card playCard() {
        System.out.println(playerID + "'s hand: " + hand);
        System.out.print("Select a card to play (index): ");
        int index = scanner.nextInt();
        // Validate index
        if (index < 0 || index >= hand.size()) {
            System.out.println("Invalid index. Try again.");
            return playCard(); // Retry if index is invalid
        }
        Card card = hand.get(index);
        removeCardFromHand(card);
        System.out.println(playerID + " played: " + card);
        return card;
    }

    @Override
public void passCards(List<Card> cardsToPass) {
    System.out.println(playerID + "'s hand: " + hand);
    System.out.println("Select 3 cards to pass:");
    List<Integer> selectedIndices = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
        System.out.print("Select card index " + (i + 1) + ": ");
        int index = scanner.nextInt();
        // Validate index
        if (index < 0 || index >= hand.size()) {
            System.out.println("Invalid index. Try again.");
            i--; // Repeat the same iteration
        } else {
            selectedIndices.add(index);
        }
    }
    // Sort indices in descending order to ensure correct card removal
    selectedIndices.sort((a, b) -> b.compareTo(a));
    // Remove selected cards
    for (int index : selectedIndices) {
        cardsToPass.add(hand.remove(index));
    }
}
}