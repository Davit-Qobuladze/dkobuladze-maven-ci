/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dato
 */
public class Bank {
    
    private double bankFine;
    
    public Bank(){
        bankFine = -20;
    }
    
    public void makeFine(Account account){
        account.setBalance(bankFine);
    }
    
    public double getFine(){
        return Math.abs(bankFine);
    }
}
