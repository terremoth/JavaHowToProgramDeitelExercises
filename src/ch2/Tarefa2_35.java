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
public class Tarefa2_35 
{
    public static void main(String[] args) 
    {
        System.out.println("Calculadora de economia da faixa solidária");
        System.out.println("--------------------------------------------");
        double totalKm, gasPrice, kmPerLt, parkingTax, toll, result;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Distancia ao trabalho: ");
        totalKm = input.nextDouble();
        
        System.out.print("Entre com o preço da por litro da gasolina: ");
        gasPrice = input.nextDouble();

        System.out.print("Quilometros que o carro anda por litro: ");
        kmPerLt = input.nextDouble();
        
        System.out.print("Pedágio por dia: ");
        toll = input.nextDouble();
        
        System.out.print("Taxas de estacionamento por dia: ");
        parkingTax = input.nextDouble();
        
        result = ((totalKm / kmPerLt) * gasPrice) + toll + parkingTax;
        
        System.out.println("Total gasto com a viagem por dia: " + result);
        System.out.println("Total gasto com a viagem por mês: " + result * 22);
    }
}
