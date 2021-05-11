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
public class Tarefa2_33 
{
    public static void main(String[] args) 
    {
        System.out.println("Calculadora de Índice de Massa Corporal (IMC)");
        System.out.println("----------------------------------------------");
        System.out.println("BMI VALUES");
        System.out.println("Abaixo do Peso: menor ou igual a 18.5");
        System.out.println("Normal:         entre 18.5 a 24.9");
        System.out.println("Acima do Peso:  entre 25 a 29.9");
        System.out.println("Obeso:          30 ou maior");
        System.out.println("----------------------------------------------");
        
        double peso;
        double altura;
        double imc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira seu peso em KG: ");
        peso = input.nextDouble();
        
        System.out.print("Insira seu altura em mts: ");
        altura = input.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é : "+ imc);
    }
}
