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
public class ClassAverage 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        
        int average = total / 10;
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}
