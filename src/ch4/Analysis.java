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
public class Analysis 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int passes   = 0;
        int failures = 0;
        int studentCounter = 1;
        
        while (studentCounter <= 10) {
            
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            
            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }
            
            studentCounter = studentCounter + 1;
        }
        
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
