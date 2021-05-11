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
public class Tarefa4_19 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numberOfSales = 0;
        int amountSold = 0;
        boolean stop = false;
        
        while (stop != true) {
            System.out.print("Entre com a o valor do item vendido ou digite -1: ");
            int userInput = input.nextInt();
            
            if (userInput != -1) {
                double amount = userInput * 0.09; 
                System.out.println("Recebido por este item: " + (int) amount);
                amountSold += (int) amount;
                numberOfSales++;
            } else {
                stop = true;
            }
        }
        
        if (stop == true) {
            System.out.printf("Total de itens vendidos na semana: %d%nRendimentos totais: %d + R$ 200,00 semanal = ", numberOfSales, amountSold);
            amountSold += 200;
            System.out.printf("R$ %d%n", amountSold);
        }
        
        
    }
}
