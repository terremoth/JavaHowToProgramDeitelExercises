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
public class Tarefa4_36 
{

    // check if 3 user input numbers can "make" a triangle
    public static void main(String[] args) {
        System.out.println("Check if 3 numbers can make a triangle rectangle - numbers must be different from 0");
        System.out.println("=================================================");

        String cantBeZeroMessage = "Numbers must be different from 0! Try again";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        if (first == 0) {
            System.out.println(cantBeZeroMessage);
            main(args);
        } else {

            System.out.print("Enter the second number: ");
            double second = input.nextDouble();
            if (second == 0) {
                System.out.println(cantBeZeroMessage);
                main(args);
                
            } else {

                System.out.print("Enter the third number: ");
                double third = input.nextDouble();
                if (third == 0) {
                    System.out.println(cantBeZeroMessage);
                    main(args);
                } else {

                    boolean canBeATriangle1 = first * first + second * second == third * third;
                    boolean canBeATriangle2 = first * first + third * third == second * second;
                    boolean canBeATriangle3 = second * second + third * third == first * first;

                    String success = "Can be a triangle!";
                    String failure = "Cannot be a triangle :(";

                    if (canBeATriangle1) {
                        System.out.println(success);
                    } else if (canBeATriangle2) {
                        System.out.println(success);
                    } else if (canBeATriangle3) {
                        System.out.println(success);
                    } else {
                        System.out.println(failure);
                    }
                }
            }
        }
    }
}
