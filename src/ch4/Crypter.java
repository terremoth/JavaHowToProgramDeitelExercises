/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import java.util.Scanner;
/**
 *
 * @author Lucas Marques Dutra <dutra.astro@gmail.com>
 */
public class Crypter 
{
    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("4-integer Encrypter");
        System.out.println("----------------------------------");
        System.out.print("Type a 4 number integer to encrypt: ");
        String errorMsg = "You must type a 4 number integer, try again!";
        int number = input.nextInt();
        
        if (number > 9999) {
            System.out.println(errorMsg);
            main(args);
        } else {
            int numberCopy = number;
            int first  = 0;
            int second = 0;
            int third  = 0;
            int fourth = 0;
            int counter = 4;
            
            while(counter > 0) {
                int encryptedNum = numberCopy % 10;
                    encryptedNum = (encryptedNum + 7) % 10;
                            
                if (counter == 1) {
                    third = encryptedNum;
                } else if (counter == 2) {
                    fourth = encryptedNum;
                } else if (counter == 3) {
                    first = encryptedNum;
                } else if (counter == 4) {
                    second = encryptedNum;
                } else {
                    System.out.println("ERROR - counter is: "+counter);
                }
                
                
                counter--;
                numberCopy /= 10;
            }
            
            System.out.printf("Encrypted: %d%d%d%d\n", first, second, third, fourth);
        }
    }
}
