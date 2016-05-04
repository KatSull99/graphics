import java.awt.*;

import javax.swing.*;
 
public class MyCanvas extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		graphics.setColor(Color.black);
    		graphics.drawLine(0, 0, 1000, 1000);
    		graphics.drawLine(1000, 0, 0, 1000);
    		graphics.setColor(Color.black);
    		graphics.drawLine(1000, 1000, 1000, 1000);
    		graphics.drawLine(0, 500, 0, 1000);
    		
    		
    		
    		graphics.setColor(Color.yellow);
    		graphics.drawRect(0, 200, 1000, 800);
  
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(900, 900, 100, 100);
	        graphics.setColor(Color.blue);
	        graphics.drawRect(900, 900, 100, 100);
	        
	        
	        graphics.setColor(Color.yellow);
	        graphics.fillOval(250, 250, 500, 500);
	        graphics.setColor(Color.black);
	        graphics.fillRect(370, 370, 50, 50);
	        graphics.setColor(Color.black);
	        graphics.fillRect(570,  370,  50,  50);
	        graphics.setColor(Color.red);
	        graphics.fillOval(450, 550, 100, 100);
	        
    					
    			}
    	}








