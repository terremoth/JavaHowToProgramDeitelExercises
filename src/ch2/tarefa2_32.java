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
public class tarefa2_32 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        int zeros = 0, positivos = 0, negativos = 0;
        
        System.out.print("Insira o primeiro inteiro: ");
        a = input.nextInt();
        
        System.out.print("Insira o segundo inteiro: ");
        b = input.nextInt();
        
        System.out.print("Insira o terceiro inteiro: ");
        c = input.nextInt();
        
        System.out.print("Insira o quarto inteiro: ");
        d = input.nextInt();
        
        System.out.print("Insira o quinto inteiro: ");
        e = input.nextInt();
        
        if (a == 0)
            zeros = zeros + 1;
        
        if (a > 0)
            positivos = positivos + 1;
        
        if (a < 0)
            negativos = negativos + 1;
        
        
        if (b == 0)
            zeros = zeros + 1;
        
        if (b > 0)
            positivos = positivos + 1;
        
        if (b < 0)
            negativos = negativos + 1;
        
        
        if (c == 0)
            zeros = zeros + 1;
        
        if (c > 0)
            positivos = positivos + 1;
        
        if (c < 0)
            negativos = negativos + 1;
        
        
        if (d == 0)
            zeros = zeros + 1;
        
        if (d > 0)
            positivos = positivos + 1;
        
        if (d < 0)
            negativos = negativos + 1;
        
        
        if (e == 0)
            zeros = zeros + 1;
        
        if (e > 0)
            positivos = positivos + 1;
        
        if (e < 0)
            negativos = negativos + 1;
        
        System.out.println("Quantidade de zeros: "      + zeros);
        System.out.println("Quantidade de positivos: "  + positivos);
        System.out.println("Quantidade de negativos: "  + negativos);
        
    }
}
