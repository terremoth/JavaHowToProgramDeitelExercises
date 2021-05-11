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
public class EmployeeTest 
{
    public static void main(String[] args)
    {
        Employee lucas = new Employee("Lucas", "Marques Dutra", 8500.00);
        Employee amanda = new Employee("Amanda", "Martins Andujar", 7350.00);
        
        System.out.printf("%s %s - Mensal: R$ %.2f, Anual: %.2f%n", lucas.getFirstName(), lucas.getLastName(), lucas.getMensalSalary(), lucas.getAnnualSalary());
        System.out.printf("%s %s - Mensal: RS %.2f, Anual: %.2f%n", amanda.getFirstName(), amanda.getLastName(), amanda.getMensalSalary(), amanda.getAnnualSalary());
        
        double lucasSalaryRaised  = lucas.getMensalSalary() + (lucas.getMensalSalary()  * 0.10);
        lucas.setMensalSalary(lucasSalaryRaised);
        
        double amandaSalaryRaised  = amanda.getMensalSalary() + (amanda.getMensalSalary()  * 0.10);
        amanda.setMensalSalary(amandaSalaryRaised);
        
        System.out.println("After 10%+");
        
        System.out.printf("%s %s - Mensal: R$ %.2f, Anual: %.2f%n", lucas.getFirstName(), lucas.getLastName(), lucas.getMensalSalary(), lucas.getAnnualSalary());
        System.out.printf("%s %s - Mensal: RS %.2f, Anual: %.2f%n", amanda.getFirstName(), amanda.getLastName(), amanda.getMensalSalary(), amanda.getAnnualSalary());
    }
    
}
