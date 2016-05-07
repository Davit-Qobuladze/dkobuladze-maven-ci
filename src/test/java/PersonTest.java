/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


/**
 *
 * @author dato
 */
public class PersonTest {
    
    private String owner;
    private double amount;
    private Account account;
    private Person person;
    private double money;
    
    @Before
    public void setUp() {
        owner = "SDP";
        amount = 1500;
        account = new Account(owner, amount);
        person = new Person(account);
        money = -20;
    }

    @Test
    public void withdraw() {
        person.changeBalance(money);
        
        double actualBalance = account.getBalance();
        double expected = amount + money;
        assertEquals(expected, actualBalance, 0);
    }

    @Test
    public void cannot_withdraw() {
        Account mockAccount = mock(Account.class);
        when(mockAccount.getBalance()).thenReturn(0.0);
        
        person.changeBalance(money);
        verify(mockAccount, never()).setBalance(money);
    }
}
