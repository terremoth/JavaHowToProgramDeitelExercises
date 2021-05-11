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
public class Tarefa4_37b 
{

    // fatorial e
    public static void main(String[] args) 
    {
        System.out.print("'e' Fatorial for: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println(1);
        } else {
            int counter = 1;
            double result = 1;
            
            while (counter <= number) {
                double fatorialResult = 1;
                int fatorialCounter = counter;
                while (fatorialCounter > 0) {
                    fatorialResult *= fatorialCounter;
                    fatorialCounter--;
                
                }
                
                result += 1/fatorialResult;
                counter++;
            }
            
            System.out.println(result);
        }
    }
}
