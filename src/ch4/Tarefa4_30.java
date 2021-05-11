/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import java.util.Scanner;

/**
 *
 * @author Lucas Marques Dutra <dutra.astro@gmail.com>
 */
public class Tarefa4_30
{

    public static void main(String[] args) 
    {
        
        System.out.println();
        
        System.out.println("Palindrome 5 size Checker");
        System.out.println("====================================");
        System.out.print("Enter a 5 digit number to check if is a palindrome: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String errorMsg = "Number should have 5 digits, try again!";
        
        if (number < 10000) {
            System.out.println(errorMsg);
            System.out.println();
            main(args);
        } else {
            if (number > 99999 ) {
                System.out.println(errorMsg);
                System.out.println();
                main(args);
            } else {                
                int decCounter = 10000;
                
                int partial = number;
                int reversed = 0;
                
                while(decCounter > 0) {
                    reversed = reversed + ((partial % 10) * decCounter);
                    
                    partial = partial/10;
                    
                    decCounter /= 10;
                }
                                
                String finalMsg = number == reversed ? "Is a palindrome!" : "Not a palindrome";
                
                System.out.println(finalMsg);
            } 
        }
        
    }
    
}
