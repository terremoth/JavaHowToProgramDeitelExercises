/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class InvoiceTest 
{
    public static void main(String[] args) 
    {
        Invoice invoice = new Invoice(23, "Mouse Gamer Tarantula", 4, 159.90);
        
        System.out.printf("Invoice %d%n", invoice.getNumber());
        System.out.println("------------------------------------");
        System.out.printf("%s - $%.2f%n", invoice.getDescription(), invoice.getValue());
        System.out.println("------------------------------------");
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Total: %.2f%n", invoice.getInvoiceAmount());
    }
}
