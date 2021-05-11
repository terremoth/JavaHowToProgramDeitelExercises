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
public class Tarefa4_21 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        
        System.out.println("Acha o maior inteiro dentro 10 inteiros inseridos");
        
        System.out.print("Insira o inteiro: ");
        int lastNumber = input.nextInt();
        int largest = lastNumber;
        
        while (counter < 10) {
            System.out.print("Insira mais um inteiro: ");
            lastNumber = input.nextInt();
            
            if (lastNumber > largest) {
                largest = lastNumber;
            }
            
            counter++;
        }
        
        System.out.println("O maior inteiro digitado foi: " + largest);
    }
}
