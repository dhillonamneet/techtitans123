/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final String gameID;
    private final List<Player> players;
    private final Deck deck;
    private int roundNumber;
    private Scanner scanner;
    private static Game instance;

    public Game(String gameID) {
        this.gameID = gameID;
        this.players = new ArrayList<>();
        this.deck = new Deck();
        this.roundNumber = 0;
        this.scanner = new Scanner(System.in);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame() {
        System.out.println("Welcome to the Hearts game.");
        
        // Determine the number of players (default is 4 for Hearts)
        int numPlayers = 4;

        // Loop to set up each player
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter name for Player " + i + ": ");
            String playerName = scanner.nextLine();
            System.out.println("Should this player be a human or AI? (Enter 'human' or 'AI'):");
            String playerType = scanner.nextLine().trim().toLowerCase();
            
            Player player;
            if (playerType.equals("human")) {
                player = new HumanPlayer(playerName);
            } else {
                player = new AIPlayer(playerName);
            }
            addPlayer(player);
        }

        System.out.println("Game " + gameID + " started.");
        startNewRound();
    }

    public void play() {
        for (int i = 0; i < 13; i++) {
            System.out.println("Trick " + (i + 1));
            Trick trick = new Trick();
            for (Player player : players) {
                Card playedCard = player.playCard();
                trick.addCard(playedCard, player);
            }
            Player trickWinner = trick.getWinner();
            int trickPoints = trick.calculatePoints();
            trickWinner.addPoints(trickPoints);
            System.out.println("Trick winner: " + trickWinner.getPlayerID() + " with " + trickPoints + " points.");
        }
        endRound();
    }

    public static Game getInstance(String gameID) {
        if (instance == null) {
            instance = new Game(gameID);
        }
        return instance;
    }

    public void endRound() {
        for (Player player : players) {
            player.updateTotalScore();
        }
        checkGameOver();
    }

    public void endGame() {
        System.out.println("Game " + gameID + " ended.");
        displayFinalScores();
        System.exit(0);
    }

    public void displayFinalScores() {
        System.out.println("Final Scores:");
        for (Player player : players) {
            System.out.println(player.getPlayerID() + " final score: " + player.getTotalScore());
        }
    }

    private void dealCards() {
        Deck deck = new Deck(); // Create a new deck for each round
        deck.shuffle();
        for (Player player : players) {
            player.setHand(deck.deal(13));
        }
    }

    private void passCards() {
        List<List<Card>> allCardsToPass = new ArrayList<>();
        for (Player player : players) {
            List<Card> cardsToPass = new ArrayList<>();
            player.passCards(cardsToPass);
            allCardsToPass.add(cardsToPass);
        }
        // Distribute cards to the next player
        for (int i = 0; i < players.size(); i++) {
            Player currentPlayer = players.get(i);
            List<Card> cardsToPass = allCardsToPass.get(i);
            Player nextPlayer = players.get((i + 1) % players.size());
            for (Card card : cardsToPass) {
                nextPlayer.addCardToHand(card);
            }
        }
    }

    private void displayRoundScores() {
        System.out.println("Round " + roundNumber + " ended. Scores for this round:");
        for (Player player : players) {
            System.out.println(player.getPlayerID() + " scored: " + player.getRoundScore());
        }
    }

    private void checkGameOver() {
        displayRoundScores();
        if (!askToContinue()) {
            endGame();
        } else {
            startNewRound();
        }
    }

    private void startNewRound() {
        roundNumber++;
        System.out.println("Starting new round: " + roundNumber);
        for (Player player : players) {
            player.resetRoundScore();
            player.setHand(new ArrayList<>());
        }
        dealCards();
        passCards();
        play();
    }

    private boolean askToContinue() {
        System.out.print("Do you want to play another round? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
}