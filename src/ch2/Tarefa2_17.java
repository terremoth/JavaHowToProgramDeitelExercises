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
public class Tarefa2_17 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        
        System.out.print("Insert the first integer: ");
        number1 = input.nextInt();
        
        System.out.print("Insert the second integer: ");
        number2 = input.nextInt();
        
        System.out.print("Insert the third integer: ");
        number3 = input.nextInt();
        
        System.out.println("Sum is: " + ( number1 + number2 + number3) );
        System.out.println("Average is: " + (( number1 + number2 + number3) / 3) );
        System.out.println("Product is: " + ( number1 * number2 * number3));
        
        // number1 with number2
        
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
        
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        
        // number 1 with number 3
        
        if (number1 == number3)
            System.out.printf("%d == %d%n", number1, number3);
        
        if (number1 != number3)
            System.out.printf("%d != %d%n", number1, number3);
        
        if (number1 > number3)
            System.out.printf("%d > %d%n", number1, number3);
        
        if (number1 < number3)
            System.out.printf("%d < %d%n", number1, number3);
        
        if (number1 >= number3)
            System.out.printf("%d >= %d%n", number1, number3);
        
        if (number1 <= number3)
            System.out.printf("%d <= %d%n", number1, number3);
        
        
        // number2 with number3
        
        if (number2 == number3)
            System.out.printf("%d == %d%n", number2, number3);
        
        if (number2 != number3)
            System.out.printf("%d != %d%n", number2, number3);
        
        if (number2 > number3)
            System.out.printf("%d > %d%n", number2, number3);
        
        if (number2 < number3)
            System.out.printf("%d < %d%n", number2, number3);
        
        if (number2 >= number3)
            System.out.printf("%d >= %d%n", number2, number3);
        
        if (number2 <= number3)
            System.out.printf("%d <= %d%n", number2, number3);
        
    }
}
