package ch2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Tarefa2_24 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, number4, number5;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        number3 = input.nextInt();
        
        System.out.print("Enter the fourth integer: ");
        number4 = input.nextInt();
        
        System.out.print("Enter the fifth integer: ");    
        number5 = input.nextInt();
        
        // bigger
        
        if (number1 > number2)
            if (number1 > number3)
                if (number1 > number4)
                    if (number1 > number5)
                        System.out.printf("Number %d is bigger%n", number1);
        
         
        if (number2 > number1)
            if (number2 > number3)
                if (number2 > number4)
                    if (number2 > number5)
                        System.out.printf("Number %d is bigger%n", number2);
        
        if (number3 > number1)
            if (number3 > number2)
                if (number3 > number4)
                    if (number3 > number5)
                        System.out.printf("Number %d is bigger%n", number3);
        
        if (number4 > number1)
            if (number4 > number2)
                if (number4 > number3)
                    if (number4 > number5)
                        System.out.printf("Number %d is bigger%n", number4);
        
        
        if (number5 > number1)
            if (number5 > number2)
                if (number5 > number3)
                    if (number5 > number4)
                        System.out.printf("Number %d is bigger%n", number5);
        
        // lesser 
        
        if (number1 < number2)
            if (number1 < number3)
                if (number1 < number4)
                    if (number1 < number5)
                        System.out.printf("Number %d is lesser%n", number1);
        
         
        if (number2 < number1)
            if (number2 < number3)
                if (number2 < number4)
                    if (number2 < number5)
                        System.out.printf("Number %d is lesser%n", number2);
        
        if (number3 < number1)
            if (number3 < number2)
                if (number3 < number4)
                    if (number3 < number5)
                        System.out.printf("Number %d is lesser%n", number3);
        
        if (number4 < number1)
            if (number4 < number2)
                if (number4 < number3)
                    if (number4 < number5)
                        System.out.printf("Number %d is lesser%n", number4);
        
        
        if (number5 < number1)
            if (number5 < number2)
                if (number5 < number3)
                    if (number5 < number4)
                        System.out.printf("Number %d is lesser%n", number5);
        
        
    }

}