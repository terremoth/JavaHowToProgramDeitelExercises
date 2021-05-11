/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;


/**
 *
 * @author Lucas Marques Dutra <dutra.astro@gmail.com>
 */
public class Tarefa4_32
{
    // desafio tabuleiro sem if
    public static void main(String[] args) 
    {
        int size = 8;
        int counterHorizontal = 0;
        int counterVertical   = 0;
        
        while (counterVertical < size) {
            
            boolean willHaveSpace = (counterVertical % 2 == 1);
            
            while (willHaveSpace) {
                System.out.print(" ");
                willHaveSpace = false;
            }
            
            while (counterHorizontal < size) {
                
                System.out.print("* ");
                counterHorizontal++;
            }
            
            System.out.println();
            
            counterHorizontal = 0;
            counterVertical++;
        } 
        
    }
    
}
