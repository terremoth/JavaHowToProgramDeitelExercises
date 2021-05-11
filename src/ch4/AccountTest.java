package ch4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class AccountTest 
{
    public static void main(String[] args) 
    {
        //Account account = new Account(1234, 500, 3, 200, 200);
        Account account = new Account(1234, 100, 3, 500, 200);
        
        int balance = account.getBalance();
        int creditLimit = account.getCreditLimit();
        
        if (creditLimit >= -balance) {
            System.out.printf("Saldo: %d - Dentro do limite de crédito: %d", balance, account.getCreditLimit());
        } else {
            System.out.printf("Limite de saldo excedido: %d - Crédito permitido: %d %n", balance, account.getCreditLimit());
        }
        
        
    }
}
