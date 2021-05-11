/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Lucas
 */
public class Tarefa4_6
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int counter = 1;
        
        while (counter <= 10) {
            sum += counter; 
            counter++;
        }
        
        System.out.println("A soma é: " + sum);
    }
}
