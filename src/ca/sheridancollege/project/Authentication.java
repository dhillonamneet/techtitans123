
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

public class Authentication {
    private final List<User> userList;

    public Authentication() {
        userList = new ArrayList<>();
    }

    public boolean register(String userID, String username, String password, String email) {
        for (User user : userList) {
            if (user.getUserID().equals(userID) || user.getUsername().equals(username) || user.getEmail().equals(email)) {
                return false; // User already exists
            }
        }
        User newUser = new User(userID, username, password, email);
        userList.add(newUser);
        return true;
    }

    public User login(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Login successful
            }
        }
        return null; // Login failed
    }

    public User getUser(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
