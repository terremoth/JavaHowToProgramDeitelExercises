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
public class DrawPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        g.drawLine(0, 0, width, height);
        
        g.drawLine(0, height, width, 0);
    }
}
