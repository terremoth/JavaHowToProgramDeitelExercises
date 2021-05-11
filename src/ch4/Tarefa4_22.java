/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Lucas Marques Dutra <dutr4@dutr4@outlook.com>
 */
public class Tarefa4_22 
{
    public static void main(String[] args) 
    {
        System.out.println("N\t10*N\t100*N\t1000*N");
        int counter = 1;
        
        while (counter < 6) {
            System.out.print(counter + "\t");
            System.out.print(counter * 10 + "\t");
            System.out.print(counter * 100 + "\t");
            System.out.print(counter * 1000 + "\t\n");
            counter++;
        }
    }
}
