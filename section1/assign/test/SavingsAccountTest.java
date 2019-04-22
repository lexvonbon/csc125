/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lexvonbon
 */
public class SavingsAccountTest {
    public SavingsAccountTest() {
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
     * Test of setBalance method, of class SavingsAccount.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double bal = 0.0;
        SavingsAccount instance = new SavingsAccount(1);
        instance.setBalance(bal);
    }

    /**
     * Test of getBalance method, of class SavingsAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        SavingsAccount instance = new SavingsAccount(0);
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of addInterest method, of class SavingsAccount.
     */
    @Test
    public void testAddInterest() {
        System.out.println("addInterest");
        double i = 0.5;
        SavingsAccount instance = new SavingsAccount(1);
        instance.addInterest(i);
    }
}