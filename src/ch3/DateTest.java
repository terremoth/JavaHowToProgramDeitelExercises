/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

/**
 *
 * @author Lucas
 */
public class DateTest 
{
    public static void main(String[] args) 
    {
        Date date = new Date(2017, 11, 12);
        System.out.printf("Day: %d%n", date.getDay());
        System.out.printf("Month: %d%n", date.getMonth());
        System.out.printf("Year: %d%n", date.getYear());
        
        date.setDay(30);
        date.setMonth(8);
        date.setYear(2005);
        
        System.out.printf("Full date: %s%n", date.displayDate());
    }
}
