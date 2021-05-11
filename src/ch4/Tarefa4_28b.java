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
public class Tarefa4_28b 
{

    /*
    saída esperada:
    @@@@@
    só pode colocar chaves e recuos
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        if (x == 8) {
        }
        if (x == 5) {
            System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}
