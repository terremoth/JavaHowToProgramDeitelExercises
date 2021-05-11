 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class DrawPanelTest 
{
    public static void main(String[] args) 
    {
//        DrawPanel panel = new DrawPanel();
//        DrawPanel2 panel = new DrawPanel2();
//        DrawPanel3 panel = new DrawPanel3();
//        DrawPanel4 panel = new DrawPanel4();
//        MultiX2 panel = new MultiX2();
//        MultiX3 panel = new MultiX3();
        MultipleSquares panel = new MultipleSquares();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
