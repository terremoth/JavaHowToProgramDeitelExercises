/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ClassAverage2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        
        while (grade != -1) {            
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        // Se o usuário inseriu ao menos uma nota...
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            
        } else {
            System.out.println("No grades were entered");
        }
    }
}
