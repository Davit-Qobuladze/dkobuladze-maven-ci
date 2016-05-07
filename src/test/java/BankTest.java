/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dato
 */
public class BankTest {
    
    private String owner;
    private double amount;
    private Account account;
    private Bank bank;
    
    @Before
    public void setUp() {
        owner = "SDP";
        amount = 1500;
        account = new Account(owner, amount);
        bank = new Bank();
    }

    @Test
    public void testMakeFine() {
        bank.makeFine(account);
        
        double actualBalance = account.getBalance();
        double expected = amount - bank.getFine();
        assertEquals(expected, actualBalance, 0);
    }

    
}
