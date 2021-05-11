package ch3;

public class Account2
{
    private String name;
    private double balance;
    
    public Account2(String name, double balance) 
    {
        this.name = name;
        if (balance > 0.0) 
            this.balance = balance;
    }
    
    public void deposit(double depositAmount) 
    {
        if (depositAmount > 0.0) 
            balance = balance + depositAmount;
    }
    
    public void withdraw(double withdrawAmount) 
    {
        double result = balance - withdrawAmount;
        if (result < 0.0)
            System.out.println("Withdraw amount exceeded account balance"); 
        
        if (result >= 0.0)
            balance = result;
            
    }
    
    public double getBalance() 
    {
        return balance;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }
}
