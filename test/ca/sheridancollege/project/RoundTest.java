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
public class RoundTest {
    
    public RoundTest() {
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
     * Test of startRound method, of class Round.
     */
    @Test
    public void testStartRound() {
        System.out.println("startRound");
        Round instance = null;
        instance.startRound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endRound method, of class Round.
     */
    @Test
    public void testEndRound() {
        System.out.println("endRound");
        Round instance = null;
        instance.endRound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determineRoundWinner method, of class Round.
     */
    @Test
    public void testDetermineRoundWinner() {
        System.out.println("determineRoundWinner");
        Round instance = null;
        Player expResult = null;
        Player result = instance.determineRoundWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTrick method, of class Round.
     */
    @Test
    public void testAddTrick() {
        System.out.println("addTrick");
        Trick trick = null;
        Round instance = null;
        instance.addTrick(trick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTricks method, of class Round.
     */
    @Test
    public void testGetTricks() {
        System.out.println("getTricks");
        Round instance = null;
        List<Trick> expResult = null;
        List<Trick> result = instance.getTricks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundNumber method, of class Round.
     */
    @Test
    public void testGetRoundNumber() {
        System.out.println("getRoundNumber");
        Round instance = null;
        int expResult = 0;
        int result = instance.getRoundNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
