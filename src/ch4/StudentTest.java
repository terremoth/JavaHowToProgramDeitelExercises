/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Lucas
 */
public class StudentTest 
{
    public static void main(String[] args) 
    {
        Student account1 = new Student("Lucas", 93.5);
        Student account2 = new Student("Amanda", 72.75);
        
        System.out.printf("%s's letter grade is %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is %s%n", account2.getName(), account2.getLetterGrade());
    }
}
