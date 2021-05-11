/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Lucas
 */
public class DrawPanel4 extends JPanel
{
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        int finalWidth  = getWidth();
        int finalHeight = getHeight();
                
        int step = 1;
        int maxSteps = 15;
        
        int partsPerWidth  = finalWidth  / maxSteps;
        int partsPerHeight = finalHeight / maxSteps;
        
        while (step <= maxSteps) 
        {            
            g.drawLine(0, partsPerHeight * step, partsPerWidth * step, finalHeight);
            step++;
        }
        
        step = 1;
        
        while (step <= maxSteps) 
        {
            g.drawLine(finalWidth, partsPerHeight * step, partsPerWidth * step, 0);
            step++;
        }
        
        step = 1;
        int lessY = finalHeight, lessX = finalWidth;
        
        while (step <= maxSteps) 
        {
            lessY -= partsPerHeight;
            lessX -= partsPerWidth;
            g.drawLine(partsPerWidth * step, finalHeight, finalWidth, lessY);
            step++;
        }
        
        
        step = 1;
        lessY = finalHeight; 
        lessX = finalWidth;
        
        while (step <= maxSteps) 
        {
            lessY -= partsPerHeight;
            lessX -= partsPerWidth;
            g.drawLine(0, lessY, partsPerWidth * step, 0);
            
            step++;
        }
        
        
    }
}
