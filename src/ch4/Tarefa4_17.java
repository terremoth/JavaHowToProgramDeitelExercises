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
public class Tarefa4_17 
{
    public static void main(String[] args) 
    {
        int totalKm = 0, totalGas = 0, sendInput = 0, travelCounter = 0;
        Scanner input = new Scanner(System.in);
        
        while (sendInput != -1) {
            System.out.print("Insira o total gasto de gasolina na viagem (em litros) ou digite -1 para sair: ");
            sendInput = input.nextInt();
            
            if (sendInput != -1) {
                totalGas += sendInput;
                System.out.print("Insira a distancia total da viagem (em KMs) ou digite -1 para sair: ");
                totalKm += input.nextInt();
                travelCounter++;
            } 
            
        }
        
        if (totalKm > 0) {
            double kmPerLt = (double) totalKm / totalGas;
            System.out.printf("Total gasto em Km/Lt: %.2f%n", kmPerLt);
            System.out.printf("Total gasto em Km: %d%n", totalKm);
            System.out.printf("Total gasto de gasolina: %d%n", totalGas);
            System.out.printf("Quantida de viagens: %d%n", travelCounter);
        }
        
    }
}
