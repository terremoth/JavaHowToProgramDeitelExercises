package ch2;

import java.util.Scanner;

/**
 * @author Lucas
 */
public class Tarefa2_30 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;
        int first, second, third, fourth, fifth;
        
        System.out.print("Insira um inteiro de 5 dígitos: ");
        number = input.nextInt();

        if (number > 99999) 
            System.out.println("O número digitado não deve ser maior que 5 dígitos");
        
        if (number < 10000) 
            System.out.println("O número digitado não deve ser menor que 5 dígitos");
        
        first  = number / 10000;        //ok
        second = number / 1000 % 10;    //ok
        third  = number % 1000 / 100;   //ok
        fourth = number % 100 / 10;     //ok
        fifth  = number % 10;           //ok
        
        System.out.printf("%d %d %d %d %d", first, second, third, fourth, fifth);
        
    }
}
