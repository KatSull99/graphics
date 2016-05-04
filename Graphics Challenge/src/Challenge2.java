import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
public class Challenge2 extends Canvas 
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
    			Scanner userInput=new Scanner (System.in);
				System.out.println("How big would you like the square to be? Please choose a number from 1 to 10. 1 is the smallest square and 10 is the largest square.");
				int sizeOfSquare=userInput.nextInt();
		    			
				
				Scanner userInput2=new Scanner (System.in);
				System.out.println("Would you like your square to be red or blue?" );
				int colorOfSquare=userInput.nextInt();
				if(choice==red)
					{
						graphics.setColor(Color.red);
				        graphics.fillRect(450, 550, 100, 100);
				    }
				else if(choice==2)
					{
					System.out.println("Hmm, I'm allergic to those.");
					}
				else
					{
					System.out.println("It is fun to play with them!");
					}	
				
				
				
    			
    			
    		}
    }
    	
