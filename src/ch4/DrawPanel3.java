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
public class DrawPanel3 extends JPanel
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
        
        int heightSum = 0;
        int widthSum = finalWidth;
                
        while (step <= maxSteps) 
        {            
            g.drawLine(0, 0, widthSum, heightSum);
            heightSum += partsPerHeight;
            widthSum -= partsPerWidth;
            step++;
            
        }
        
        step = 1;
        heightSum = 0;
        while (step <= maxSteps) 
        {            
            g.drawLine(finalWidth, 0, widthSum, heightSum);
            heightSum += partsPerHeight;
            widthSum += partsPerWidth;
            step++;
        }
        
        step = 1;
        heightSum = 0;
        while (step <= maxSteps) 
        {            
            g.drawLine(finalWidth, finalHeight, widthSum, heightSum);
            heightSum += partsPerHeight;
            widthSum -= partsPerWidth;
            step++;
        }
        
        step = 1;
        heightSum = 0;
        widthSum = 0;
        while (step <= maxSteps) 
        {            
            g.drawLine(0, finalHeight, widthSum, heightSum);
            heightSum += partsPerHeight;
            widthSum += partsPerWidth;
            step++;
        }
        
        
    }
}
