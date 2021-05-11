/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class HeartRatesTest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Heart Rates Test");
        System.out.println("----------------------------------");
        
        System.out.print("Insira seu nome: ");
        String firstName = input.nextLine();
        
        System.out.print("Insira seu sobrenome: ");
        String lastName = input.nextLine();
        
        System.out.print("Insira o dia da sua data de nascimento: ");
        int birthDay = input.nextInt();
        
        System.out.print("Insira o mês da sua data de nascimento: ");
        int birthMonth = input.nextInt();
        
        System.out.print("Insira o ano da sua data de nascimento: ");
        int birthYear = input.nextInt();
        
        HeartRates heartRate = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
        
        System.out.printf("Nome: %s %s%n", heartRate.getFirstName(), heartRate.getLastName());
        System.out.printf("Nascimento: %d/%d/%d %n", heartRate.getBirthDay(), heartRate.getBirthMonth(), heartRate.getBirthYear());
        System.out.printf("Idade: %d%n", heartRate.getAge());
        System.out.printf("Frequência cardíaca máxima: %d%n", heartRate.maxHeartRate());
        System.out.printf("Frequência cardíaca alvo: %.2f - %.2f%n", heartRate.minTargetHeartRate(), heartRate.maxTargetHeartRate());
    }
}
