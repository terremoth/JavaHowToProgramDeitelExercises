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
public class Mystery3 
{
    public static void main(String[] args) 
    {
        int row = 10;
        
        while (row >= 1) {
            
            int column = 1;
            
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            
            --row;
            System.out.println();
        }
    }
}
