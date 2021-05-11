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
public class Tarefa4_31
{

    // binary number getter
    public static void main(String[] args) 
    {
       
        System.out.println("Binary to decimal converter");
        System.out.println("============================================");
        System.out.print("Enter a binary number to convert: ");
        
        Scanner userInput = new Scanner(System.in);
        int typedBinaryNumber = userInput.nextInt();
        
        int exponentialBase = 1; // em binário o incrementador vai de 1 - 2 - 4 - 8 - 16 - 32... ou seja: base exponencial "2"
        int decimalConvertedNumber = 0;
        
        while(typedBinaryNumber >= 1) {
            
            int lastNumberPart      = typedBinaryNumber % 10; // aqui eu pego o último numero dos numeros digitado pelo usuário
            decimalConvertedNumber += lastNumberPart * exponentialBase;
            exponentialBase        *= 2;
            typedBinaryNumber      /= 10; // aqui eu vou tirando esses números que eu já converti pra decimal, 
                                         // já que divisão de inteiros em java não gera float
        } 
        
        System.out.println("Binary converted: " +decimalConvertedNumber);
    }
    
}
