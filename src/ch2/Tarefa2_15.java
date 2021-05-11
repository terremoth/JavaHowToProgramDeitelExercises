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
public class Tarefa2_15 
{
    public static void main(String[] args) 
    {
        int a, b;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro inteiro: ");
        a = input.nextInt();
        
        System.out.print("Entre com o segundo inteiro: ");
        b = input.nextInt();
        
        System.out.printf("Soma é %d%n",      (a + b));
        System.out.printf("Produto é %d%n",   (a * b));
        System.out.printf("Diferença é %d%n", (a - b));
        System.out.printf("Quociente é %d%n", (a / b));
        
    }
}   
