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
public class Tarefa2_28 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int raio;
        
        System.out.println("Cálculo de propriedades de um círculo");
        System.out.print("Insira o valor do raio: ");
        raio = input.nextInt();
        
        System.out.printf("Diametro: %d%n", 2 * raio);
        System.out.printf("Circunferência: %f%n", (2 * Math.PI * raio));
        System.out.printf("Área: %f%n", (Math.PI * raio * raio));
    }
}
