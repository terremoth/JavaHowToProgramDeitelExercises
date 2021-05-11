package ch3;

import java.util.Scanner;

public class AccountTest1Refactored 
{
    public static void main(String[] args) 
    {        
        Account account1 = new Account("Lucas", 50.00);
        Account account2 = new Account("Amanda", -7.53);
        
        AccountTest1Refactored.displayAccount(account1);
        AccountTest1Refactored.displayAccount(account2);
    }
    
    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("%s balance is: %s%n%n", accountToDisplay.getName(), accountToDisplay.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter deposit amount for account %s: ", accountToDisplay.getName());
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to %s balance%n%n", depositAmount, accountToDisplay.getName());
        accountToDisplay.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
