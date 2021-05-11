package ch2;
import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args) 
    {
        System.out.print("Digite um número para somar: ");
        
        Scanner input = new Scanner(System.in);
        Integer a = input.nextInt();
        
        System.out.print("\n");
        
        System.out.print("Digite outro número para a soma: ");
        Integer b = input.nextInt();
        
        Integer sum = a + b;
        System.out.printf("O resultado da soma foi: %s%n", sum);
    }
}
