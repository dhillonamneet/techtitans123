
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jassk
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        Scanner scanner = new Scanner(System.in);

        // User registration
        System.out.println("Welcome to Hearts Game!");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter user ID: ");
            String userID = scanner.nextLine();
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            boolean registrationSuccess = auth.register(userID, username, password, email);
            if (registrationSuccess) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed! User already exists.");
                return;
            }
        }

        // User login
        User loggedInUser = null;
        while (loggedInUser == null) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            loggedInUser = auth.login(username, password);
            if (loggedInUser == null) {
                System.out.println("Login failed! Please try again.");
            } else {
                System.out.println("Login successful!");
            }
        }

        System.out.print("Enter game ID: ");
        String gameID = scanner.nextLine();
        
        Game game = new Game(gameID);

        // Prompt for player names and create players
//        for (int i = 1; i <= 4; i++) {
//            System.out.print("Enter name for Player " + i + ": ");
//            String playerName = scanner.nextLine();
//
//            if (i <= 2) {
//                game.addPlayer(new HumanPlayer(playerName));
//            } else {
//                game.addPlayer(new AIPlayer(playerName));
//            }
//        }

        System.out.println("Select game mode:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Enter your choice: ");
        scanner.nextLine();  // Consume newline

        // Start the game
        game.startGame();

        // Play the game
        game.play();

        // End the game
        game.endGame();

        // Display scores
        game.displayFinalScores();
        
        scanner.close();
    }
}