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
public class Tarefa4_29 {

    public static void main(String[] args) {
        System.out.println("Empty Square Drawer");
        System.out.println("===============================================");
        System.out.print("Enter the square's side size (1-20): ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int firstRowAndTotal = size;

        String errorMsg = "You should enter a number between 1 and 20!";

        if (size < 1) {
            System.out.println(errorMsg);
            System.out.println();
            main(args);
        } else {
            if (size > 20) {
                System.out.println(errorMsg);
                System.out.println();
                main(args);
            }
        }

        while (size > 0) {
            if (size == firstRowAndTotal) {

                int j = 0;

                while (j < firstRowAndTotal) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();

            } else {
                if (size == 1) {

                    int j = 0;

                    while (j < firstRowAndTotal) {
                        System.out.print("*");
                        j++;
                    }

                    System.out.println();

                } else {

                    System.out.print("*");

                    int j = 0;

                    while (j < firstRowAndTotal - 2) {
                        System.out.print(" ");
                        j++;
                    }

                    System.out.print("*");
                    System.out.println();
                }
            }
            --size;
        }
    }
}
