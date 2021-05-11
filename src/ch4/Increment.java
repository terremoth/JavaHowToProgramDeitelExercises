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
public class Increment 
{
    public static void main(String[] args) 
    {
        int c = 5;

        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("      postincrementing: %d%n", c++);
        System.out.printf("c after postincrement:  %d%n%n", c);
        
        c = 5;
        
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("      postincrementing: %d%n", ++c);
        System.out.printf("c after postincrement:  %d%n%n", c);
        
    }
}
