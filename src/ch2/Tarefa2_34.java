/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

/**
 *
 * @author Lucas
 */
public class Tarefa2_34 
{
    public static void main(String[] args) 
    {
        double anualTax = 1.2 / 100;
        double population = 7.580;
        
        double firstYear =  population + (population * anualTax);
        double secondYear = firstYear + (firstYear * anualTax);
        double thirdYear  = secondYear + (secondYear * anualTax);
        double fourthYear = thirdYear + (thirdYear * anualTax);
        double fifthYear  = fourthYear + (fourthYear * anualTax);
        
        System.out.println("Today's population: "+ population + " bi");
        System.out.println("After 1 year:  "+ firstYear +" bi");
        System.out.println("After 2 years: "+ secondYear+" bi");
        System.out.println("After 3 years: "+ thirdYear +" bi");
        System.out.println("After 4 years: "+ fourthYear+" bi");
        System.out.println("After 5 years: "+ fifthYear +" bi");
    }
}
