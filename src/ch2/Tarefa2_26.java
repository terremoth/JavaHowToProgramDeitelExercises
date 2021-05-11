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
public class Tarefa2_26 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number1, number2, result;
        
        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();
        
        result = number1 % number2;
        
        if (result == 0)
            System.out.printf("First number is multiple of the second number, rest: %d%n", result);
        
        if (result != 0)
            System.out.printf("First number is not multiple of the second number, rest: %d%n", result);
        
    }
}
