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
public class Tarefa4_20 
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int minAcceptedHoursPerWeek = 40;
        double finalSalary;
        int flag = 0;
        
        System.out.println("Calculador de Salários");
        System.out.printf("Horas mínimas sem ganho de hora extra: %d\n", minAcceptedHoursPerWeek);
        
        while (flag != -1) {
            System.out.print("Digite -1 para sair ou comece Inserindo o valor do salário/hora: ");
            double grossSalary = input.nextFloat();
            
            if (grossSalary != -1) {
                System.out.print("Insira horas trabalhadas na semana: ");
                double workedHours = input.nextFloat();
                
                if (workedHours <= minAcceptedHoursPerWeek) {
                    finalSalary = workedHours * grossSalary;
                } else {
                    double normalSalary  = workedHours * grossSalary;
                    double extraHours    = workedHours - minAcceptedHoursPerWeek;
                    double extraSalary   = grossSalary + (grossSalary * 0.5);
                    
                    finalSalary = (normalSalary + (extraSalary * extraHours));                    
                    System.out.printf("You made %.2f extra hours\n", extraHours);
                }
                
                System.out.printf("Your final salary is %.2f\n====================================\n", finalSalary);
                
            } else {
                flag = -1;
            }
        }
        // program end
    }
}
