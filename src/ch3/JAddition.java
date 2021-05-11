/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class JAddition 
{
    public static void main(String[] args) 
    {
        String strNumber = JOptionPane.showInputDialog("Digite um número para somar: ");
        int number1 = Integer.parseInt(strNumber);
        
        String strNumber2 = JOptionPane.showInputDialog("Digite outro número para somar: ");
        int number2 = Integer.parseInt(strNumber2);
        
        int sum = number1 + number2;
        String message = String.format("Sum is %d", sum);
        JOptionPane.showMessageDialog(null, message);

    }
}
