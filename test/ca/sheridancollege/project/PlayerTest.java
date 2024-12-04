/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dhill
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundScore method, of class Player.
     */
    @Test
    public void testGetRoundScore() {
        System.out.println("getRoundScore");
        Player instance = null;
        int expResult = 0;
        int result = instance.getRoundScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalScore method, of class Player.
     */
    @Test
    public void testGetTotalScore() {
        System.out.println("getTotalScore");
        Player instance = null;
        int expResult = 0;
        int result = instance.getTotalScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class Player.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        List<Card> newHand = null;
        Player instance = null;
        instance.setHand(newHand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        List<Card> expResult = null;
        List<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToHand method, of class Player.
     */
    @Test
    public void testAddCardToHand() {
        System.out.println("addCardToHand");
        Card card = null;
        Player instance = null;
        instance.addCardToHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromHand method, of class Player.
     */
    @Test
    public void testRemoveCardFromHand() {
        System.out.println("removeCardFromHand");
        Card card = null;
        Player instance = null;
        instance.removeCardFromHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playCard method, of class Player.
     */
    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        Player instance = null;
        Card expResult = null;
        Card result = instance.playCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passCards method, of class Player.
     */
    @Test
    public void testPassCards() {
        System.out.println("passCards");
        List<Card> cardsToPass = null;
        Player instance = null;
        instance.passCards(cardsToPass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPoints method, of class Player.
     */
    @Test
    public void testAddPoints() {
        System.out.println("addPoints");
        int points = 0;
        Player instance = null;
        instance.addPoints(points);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetRoundScore method, of class Player.
     */
    @Test
    public void testResetRoundScore() {
        System.out.println("resetRoundScore");
        Player instance = null;
        instance.resetRoundScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTotalScore method, of class Player.
     */
    @Test
    public void testUpdateTotalScore() {
        System.out.println("updateTotalScore");
        Player instance = null;
        instance.updateTotalScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPlay method, of class Player.
     */
    @Test
    public void testIsValidPlay() {
        System.out.println("isValidPlay");
        Card card = null;
        Card.Suit leadSuit = null;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isValidPlay(card, leadSuit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("");
        }

        public Card playCard() {
            return null;
        }

        public void passCards(List<Card> cardsToPass) {
        }
    }
    
}
