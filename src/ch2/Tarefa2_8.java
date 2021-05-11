/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.Scanner;

/**
 * Software para calcular exemplo de folha de pagamento
 * @author Lucas
 */
public class Tarefa2_8 
{
    public static void main(String[] args) 
    {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        b = input.nextInt();
        System.out.print("Enter an integer: ");
        c = input.nextInt();
        a = b * c;
    }
}
