package ch3;

import java.util.Scanner;

public class AccountTest2
{
    public static void main(String[] args) 
    {        
        Account2 account1 = new Account2("Lucas", 50.00);
        Account2 account2 = new Account2("Amanda", -7.53);
        
        System.out.printf("%s balance is: %s%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: %s%n%n", account2.getName(), account2.getBalance());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to Account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
    
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to Account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
        
        // Withdraw 
        
        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to Account2 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);
        
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
        
        System.out.print("Enter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to Account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);
        
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
    }
}
