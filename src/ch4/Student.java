/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Lucas
 */
public class Student 
{
    private String name;
    private double average;

    public Student(String name, double average) 
    {
        this.name = name;
        if (average > 0.0)
            if(average <= 100.0)
                this.average = average;
        
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getAverage() 
    {
        return average;
    }

    public void setAverage(double average) 
    {
        if (average > 0.0)
            if(average <= 100.0)
                this.average = average;
    }
    
    public String getLetterGrade() 
    {
        String letterGrade = "";
        
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else
            letterGrade = "E";
        
        return letterGrade;
    }
    
}
