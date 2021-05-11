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
public class HeartRates 
{
    public String firstName;
    public String lastName;
    public int birthDay;
    public int birthMonth;
    public int birthYear;
    
    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) 
    {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthDay   = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear  = birthYear;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public int getBirthDay()
    {
        return this.birthDay;
    }
    
    public void setBirthDay(int birthDay)
    {
        this.birthDay = birthDay;
    }
    
    public int getBirthMonth()
    {
        return this.birthMonth;
    }
    
    public void setBirthMonth(int birthMonth)
    {
        this.birthMonth = birthMonth;
    }
    
    public int getBirthYear()
    {
        return this.birthYear;
    }
    
    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
    
    public int getAge()
    {
        return 2017 - this.getBirthYear();
    }
    
    public int maxHeartRate()
    {
        return 220 - this.getAge();
    }
    
    public double minTargetHeartRate()
    {
        int max = this.maxHeartRate();
        double result = max - (max * 0.50);
        return result;
    }
    
    public double maxTargetHeartRate()
    {
        int max = this.maxHeartRate();
        double result = max - (max * 0.85);
        return result;
    }
    
}
