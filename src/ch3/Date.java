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
public class Date 
{
    public int day;
    public int month;
    public int year;
    
    public Date(int year, int month, int day) 
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getDay()
    {
        return this.day;
    }
    
    public void setDay(int day)
    {
        this.day = day;
    }
    
    public int getMonth()
    {
        return this.month;
    }
    
    public void setMonth(int month)
    {
        this.month = month;
    }
    
    public int getYear()
    {
        return this.year;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    public String displayDate()
    {
        String date = String.format("%d/%d/%d", this.day, this.month, this.year);
        return date;
    }
}
