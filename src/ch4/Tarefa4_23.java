/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import java.util.Scanner;
/**
 *
 * @author Lucas Marques Dutra <dutr4@dutr4@outlook.com>
 */
public class Tarefa4_23 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int counter = 2;
        
        System.out.println("Acha os 2 maiores inteiros dentro 10 inteiros inseridos");
        
        System.out.print("Insira o inteiro: ");
        int lastNumber1 = input.nextInt();
        System.out.print("Insira mais um inteiro: ");
        int lastNumber2 = input.nextInt();
        
        int largest1 = lastNumber1;
        int largest2 = lastNumber2;
        
        while (counter < 10) {
            System.out.print("Insira mais um inteiro: ");
            int tmpLast = input.nextInt();
            
            if (tmpLast > largest1) {
                int tmpLast2 = largest1;
                largest1 = tmpLast;
                
                if (tmpLast2 > largest2) {
                    largest2 = tmpLast2;
                }
            } else {
                if (tmpLast > largest2) {
                    largest2 = tmpLast;
                }
            }
         
            counter++;
        }
        
        System.out.println("O maior inteiro digitado foi: " + largest1);
        System.out.println("O segundo maior inteiro digitado foi: " + largest2);
    }
}
