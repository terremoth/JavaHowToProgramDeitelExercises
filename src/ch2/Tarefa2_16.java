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
public class Tarefa2_16 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Insira o primeiro inteiro: ");
        a = input.nextInt();
        System.out.print("Insira o segundo inteiro: ");
        b = input.nextInt();
        
        if (a > b)
            System.out.println("First number is larger");
        
        if (a < b)
            System.out.println("Second number is larger");
        
        if (a == b) 
            System.out.println("These numbers are equal");
    }
}
