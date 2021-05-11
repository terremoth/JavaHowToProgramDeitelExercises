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
public class NameDialog 
{
    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome, %s, to Java Programming", name);
        
        JOptionPane.showMessageDialog(null, message);
    }
}
