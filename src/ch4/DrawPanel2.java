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
public class DrawPanel2 extends JPanel
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
    }
}
