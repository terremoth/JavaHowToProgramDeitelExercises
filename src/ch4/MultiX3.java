/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author Lucas
 */
public class MultiX3 extends JPanel
{
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        int maxSteps = 15;
        int step = 0;
        
        int width  = getWidth();
        int height = getHeight();
        
        int widthParts  = width  / maxSteps;
        int heightParts = height / maxSteps;
        
        while (step <= maxSteps) {
            g.drawLine(widthParts * step, 30, width/2, height/2);
            step++;
        }
        
        
        step = 0;
        
//        while (step <= maxSteps) {
//            g.drawLine(30, heightParts * step +30, width-30, height - (step * heightParts) -30);
//            step++;
//        }
        
    }
}
