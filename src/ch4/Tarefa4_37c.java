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
public class Tarefa4_37c 
{

    // fatorial e^n
    public static void main(String[] args) 
    {
        System.out.print("'e^n' Fatorial for (n): ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println(1);
        } else {
            int counter = 1;
            double result = 1;
            
            while (counter <= number) {
                
                result += pow(number, counter) / fact(counter);
                counter++;
            }
            
            System.out.println(result);
        }
    }
    
    public static double pow(int number, int exp) 
    {
        int numberPowerNumber = number;
        int powerCounter = 0;
        double powerResult = 1;

        while(powerCounter < exp) {
            powerResult *= numberPowerNumber;
            powerCounter++;
        }
        
        return powerResult;
    }
    
    public static double fact(int number) 
    {
        double fatorialResult = 1;
        
        while (number > 0) {
            fatorialResult *= number--;
        }
        
        return fatorialResult;
    }
}
