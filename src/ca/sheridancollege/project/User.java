
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jassk
 */
/**
 * Represents a user in the authentication system.
 */
public class User {
    private final String userID;
    private String username;
    private String password;
    private String email;

    /**
     * Constructs a new User.
     * @param userID The ID of the user.
     * @param username The username of the user.
     * @param password The password of the user.
     * @param email The email of the user.
     */
    public User(String userID, String username, String password, String email) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * Gets the user's ID.
     * @return The user's ID.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Gets the username of the user.
     * @return The username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password of the user.
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets the email of the user.
     * @return The email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Updates the user's profile information.
     * @param username The new username.
     * @param password The new password.
     * @param email The new email.
     */
    public void updateProfile(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * Retrieves the user details.
     * @return A string representing the user's details.
     */
    public String getUserDetails() {
        return "UserID: " + userID + ", Username: " + username + ", Email: " + email;
    }
}

