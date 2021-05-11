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
public class Test1 
{
    public static void main(String[] args) 
    {
        int x = 1, total;
        while (x <= 10) {
            //total += x; //Throws Runtime Exception - Uncompilable source code - variable total might not have been initialized
            ++x;
        }
    }
}
