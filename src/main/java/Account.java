/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dato
 */
public class Account {
    
    private String owner;
    private double amount;
    
    public Account(String owner, double amount){
        this.owner = owner;
        this.amount = amount;
    }
    
    public void setBalance(double money){
        if (money > 0 || Math.abs(money) < Math.abs(amount))
            amount += money;
    }
    
    public double getBalance(){
        return amount;
    }
}
