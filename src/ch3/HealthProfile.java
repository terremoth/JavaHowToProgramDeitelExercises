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
public class HealthProfile 
{
    public String firstName;
    public String lastName;
    public int birthDay;
    public int birthMonth;
    public int birthYear;
    public String sex;
    public float height;
    public float weight;
    
    public HealthProfile(String firstName, String lastName, String sex, int birthDay, int birthMonth, int birthYear, float height, float weight) 
    {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthDay   = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear  = birthYear;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
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
    
    public String getSex()
    {
        return this.sex;
    }
    
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    
    public float getHeight()
    {
        return this.height;
    }
    
    public void setHeight(float height)
    {
        this.height = height;
    }
    
    public float getWeight() 
    {
        return this.weight;
    }
    
    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    
    public static void showImcTable()
    {
        System.out.println("----------------------------------------------");
        System.out.println("BMI VALUES");
        System.out.println("Abaixo do Peso: menor ou igual a 18.5");
        System.out.println("Normal:         entre 18.5 a 24.9");
        System.out.println("Acima do Peso:  entre 25 a 29.9");
        System.out.println("Obeso:          30 ou maior");
        System.out.println("----------------------------------------------");
    }
}
