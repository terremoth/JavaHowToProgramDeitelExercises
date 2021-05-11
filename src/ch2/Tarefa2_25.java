/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Tarefa2_25
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number, result;
        
        System.out.print("Digit a number to verify if it is odd or even: ");
        number = input.nextInt();
        result = number % 2;
        
        if (result == 0)
            System.out.println("Number is even");
        
        if (result == 1)
            System.out.println("Number is odd");
    }
}
