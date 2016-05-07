/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dato
 */
public class Person {
    
    private Account account;
    
    public Person(Account account){
        this.account = account;
    }
    
    public void changeBalance(double money){
        double currentBalance = account.getBalance();
        if (money > 0 || Math.abs(money) < Math.abs(currentBalance))
            account.setBalance(money);
    }
    
}
