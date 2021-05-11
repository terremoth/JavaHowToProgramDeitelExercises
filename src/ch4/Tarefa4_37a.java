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
public class Tarefa4_37a 
{

    // fatorial
    public static void main(String[] args) 
    {
        System.out.print("Fatorial for: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println(1);
        } else {
            int counter = number;
            int result = 1;
            
            while (counter >= 1) {
                result *= counter;
                counter--;
            }
            
            System.out.println(result);
        }
    }
}
