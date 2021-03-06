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
public class MultiX extends JPanel
{
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        int maxSteps = 10;
        int step = 0;
        
        int width  = getWidth();
        int height = getHeight();
        
        int widthParts  = width  / maxSteps;
        int heightParts = height / maxSteps;
        
        while (step < maxSteps) {
            g.drawLine(widthParts * step, 0, width - (step * widthParts), height);
            step++;
        }
    }
}
