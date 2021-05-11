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
public class Invoice 
{
    private int number;
    private String description;
    private int quantity;
    private double value;
    
    public Invoice(int number, String description, int quantity, double value) 
    {
        if (quantity < 0)
            quantity = 0;
        
        if (value < 0.0)
            value = 0.0;
        
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.value = value;
        
    }
    
    public double getInvoiceAmount()
    {
        double result = quantity * value;
        return result;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public double getValue()
    {
        return this.value;
    }
    
    public void setValue(double value)
    {
        this.value = value;
    }
    
}
