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
public class Employee 
{
    public String firstName;
    public String lastName;
    public double mensalSalary;
    
    public Employee(String firstName, String lastName, double mensalSalary) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
            
        if (mensalSalary < 0.0) 
            mensalSalary = 0;
        
        this.mensalSalary = mensalSalary;
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
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public double getMensalSalary()
    {
        return this.mensalSalary;
    }
    
    public void setMensalSalary(double mensalSalary)
    {
        this.mensalSalary = mensalSalary;
    }
    
    public double getAnnualSalary()
    {
        return this.mensalSalary * 12;
    }
}
