/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Lucas
 */
public class Account 
{
    private int accountNumber;
    private int previousBalance;
    private int totalItensPerMonth;
    private int creditsPerMonth;
    private int creditLimit;
    private int balance;
    
    public Account(int accountNumber, int previousBalance, int totalItensPerMonth, int creditsPerMonth, int creditLimit) 
    {
        this.accountNumber = accountNumber;
        this.previousBalance = previousBalance;
        this.totalItensPerMonth = totalItensPerMonth;
        this.creditsPerMonth = creditsPerMonth;
        this.creditLimit = creditLimit;
        
        this.balance = previousBalance - creditsPerMonth;
    }
    
    // Getters and setters above

    public int getPreviousBalance() 
    {
        return previousBalance;
    }

    public void setPreviousBalance(int previousBalance) 
    {
        this.previousBalance = previousBalance;
    }
    
    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public int getBalance() 
    {   
        return balance;
    }

    public void setBalance(int balance) 
    {
        this.balance = balance;
    }

    public int getTotalItensPerMonth() 
    {
        return totalItensPerMonth;
    }

    public void setTotalItensPerMonth(int totalItensPerMonth) 
    {
        this.totalItensPerMonth = totalItensPerMonth;
    }

    public int getCreditsPerMonth() 
    {
        return creditsPerMonth;
    }

    public void setCreditsPerMonth(int creditsPerMonth) 
    {
        this.creditsPerMonth = creditsPerMonth;
    }

    public int getCreditLimit() 
    {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) 
    {
        this.creditLimit = creditLimit;
    }
    
    
}
