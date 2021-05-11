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
public class MultipleSquares extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        int step = 0;
        int maxSteps = 15;
        
        int width = getWidth();
        int height = getHeight();

        int heightParts = height / maxSteps;
        int widthParts  = width  / maxSteps;
        
        while (step < maxSteps) {
            g.drawLine(step * widthParts, 0, step * widthParts, height);
            step++;
        }
        
        step = 0;
        while (step < maxSteps) {
            g.drawLine(0, step * heightParts, width, step * heightParts);
            step++;
        }
        
    }
}
