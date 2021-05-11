/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.Scanner;

/**
 * Calcula o produto de 3 inteiros
 * @author Lucas
 */
public class NumberProducts 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        
        System.out.print("Digite o primeiro inteiro: ");
        x = input.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        y = input.nextInt();
        System.out.print("Digite o terceiro inteiro: ");
        z = input.nextInt();
        result = x * y *z;
        System.out.printf("Product is %d", result);
    }
}
