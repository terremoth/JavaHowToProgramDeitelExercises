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
public class HearthProfileTest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Health Profile Test");
        System.out.println("----------------------------------");
        
        System.out.print("Insira seu nome: ");
        String firstName = input.nextLine();
        
        System.out.print("Insira seu sobrenome: ");
        String lastName = input.nextLine();
        
        System.out.print("Insira seu sexo (m/f): ");
        String sex = input.nextLine();
        
        System.out.print("Insira o dia da sua data de nascimento: ");
        int birthDay = input.nextInt();
        
        System.out.print("Insira o mês da sua data de nascimento: ");
        int birthMonth = input.nextInt();
        
        System.out.print("Insira o ano da sua data de nascimento: ");
        int birthYear = input.nextInt();
        
        System.out.print("Insira sua altura em mt: ");
        float height = input.nextFloat();
        
        System.out.print("Insira o seu peso em KG: ");
        float weight = input.nextFloat();
        
        HealthProfile healthProfile = new HealthProfile(firstName, lastName, sex, birthDay, birthMonth, birthYear, height, weight);
        
        System.out.printf("Nome: %s %s%n", healthProfile.getFirstName(), healthProfile.getLastName());
        System.out.printf("Nascimento: %d/%d/%d %n", healthProfile.getBirthDay(), healthProfile.getBirthMonth(), healthProfile.getBirthYear());
        System.out.printf("Sexo: %s%n", healthProfile.getSex());
        System.out.printf("Idade: %d%n", healthProfile.getAge());
        
        System.out.println("--------------------------------------------");
        System.out.println("Frequência Cardíaca");
        System.out.println("--------------------------------------------");
        System.out.printf("Frequência cardíaca máxima: %d%n", healthProfile.maxHeartRate());
        System.out.printf("Frequência cardíaca alvo: %.2f - %.2f%n", healthProfile.minTargetHeartRate(), healthProfile.maxTargetHeartRate());
        System.out.println("--------------------------------------------");
        
        System.out.println("IMC");
        HealthProfile.showImcTable();
        
        double imc = weight / (height * height);
        
        System.out.println("Seu IMC é : "+ imc);
        
    }
}
