import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT
	
public class MyBoard extends Canvas 
{
	/**
	 * 
	 */
		private static final long	serialVersionUID	= 1L;
		
		public static void main(String[] args)
			{
			MyBoard graphics = new MyBoard();
			JFrame frame = new JFrame();
			frame.setSize(1000, 1000);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().add(graphics).setBackground(Color.white);
		    frame.setLocationRelativeTo(null); 
	        frame.setResizable(false);
	        frame.setVisible(true);
			}
		
		public void paint(Graphics graphics)
		{
//		//challenge #1
//		graphics.setColor(Color.red);
//		graphics.drawLine(0 , 0 , 900 , 800);
//		graphics.drawLine(900, 0, 0, 800);
//		
//		//challenge #2 
//		graphics.setColor(Color.pink);
//		graphics.fillRect(0 , 0 , 800, 250);
//			
//		//challenge #3
//		//*change board size*
//		graphics.setColor(Color.red); 
//		graphics.drawRect(0, 0, 250, 250);
//			
//		//challenge #4
//		//*change board size*
//		graphics.setColor(Color.blue);
//		graphics.drawRect(499, 499, 499, 499);
//		graphics.setColor(Color.yellow);
//		graphics.fillRect(500, 500, 500, 500); 
//			
//		//challenge #5
//		//*change board size*
//		graphics.setColor(Color.yellow);
//		graphics.fillOval(0, 0, 300, 300); 
//		graphics.setColor(Color.blue);
//		graphics.fillRect(75, 75, 37, 37);
//		graphics.fillRect(150, 75, 37, 37);
//		graphics.setColor(Color.red);
//		graphics.fillOval(90, 200, 125, 100);
//		
//		//challenge #6
//		//*asks user input*
//		Scanner userInput = new Scanner(System.in);
//		Scanner userInput1 = new Scanner(System.in); 
//		System.out.println("What do you want the size of the square to be? Range is 10-50.");
//		int size = userInput.nextInt();
//		System.out.println("What do you want the color of the square to be? Blue or Red? ");
//		String color = userInput1.nextLine();
//		if (color.equals("Blue"))
//			{
//			graphics.setColor(Color.blue);
//			}
//		else if (color.equals("Red"))
//			{
//			graphics.setColor(Color.red);
//			}
//		graphics.fillRect(100, 100, size, size);
//		
//		//challenge #7
//		//* all RGB colors*
//	
//	for (int red = 0; red< 255; red++)
//		{	
//        for(int green = 0; green< 255; green++)
//		 {	 
//		for (int blue = 0; blue< 255; blue++)  
//		  {
//	   graphics.setColor(new Color(red, green, blue));
//	   graphics.fillRect(300, 300, 100, 100);
//		}
//    }
//}
//		
//		//challenge #8
//		//moving stuff
//		 for (int i = 0; i < 900; i++)
//	       {
//		   graphics.setColor(Color.blue);
//		   graphics.fillRect(i, 0, 20, 20);
//		        
//		    delay();
//		        
//	        graphics.setColor(Color.white);
//		    graphics.fillRect(i, 0, 20, 20);
//	        	}
//			
//		//challenge #9
//		//move the same square at an angle
//		Boolean isStillGoing = true; 
//		while(isStillGoing = true)
//			{
//		 for (int i = 0; i < 380; i++)
//		       {
//			   graphics.setColor(Color.blue);
//			   graphics.fillRect(i, 0, 20, 20);
//			        
//			    delay();
//			        
//		        graphics.setColor(Color.white);
//			    graphics.fillRect(i, 0, 20, 20);
//		        } 
//		for (int k = 379; k > 20; k--)
//			{
//			graphics.setColor(Color.blue);
//		    graphics.fillRect(k, 0, 20, 20);
//			        
//			  delay();
//			        
//		     graphics.setColor(Color.white);
//			 graphics.fillRect(k, 0, 20, 20);
//		     }
//			}
//		
//		//challenge #10
//	    //checker board 
//		 for (int i = 0; i < 400; i = i + 100)
//			 {
//			for (int k = 0; k < 400; k = k + 100)
//				{
//			graphics.setColor(Color.CYAN);
//			graphics.fillRect(i, k, 50, 50);
//				}
//			 }
//		 for (int j = 50; j < 400; j = j + 100)
//			 {
//			for (int l = 0; l < 400; l = l + 100)
//				{
//		   graphics.setColor(Color.magenta);
//		   graphics.fillRect(j, l, 50, 50);
//				}
//		for (int m = 0; m < 400; m = m + 100)
//				 {
//				for (int n = 50; n < 400; n = n + 100)
//					{
//			   graphics.setColor(Color.magenta);
//			   graphics.fillRect(m, n, 50, 50);
//					}
//			 }
//		for (int s = 50; s < 400; s = s + 100)
//			 {
//			for (int r = 50; r < 400; r = r + 100)
//				{
//			graphics.setColor(Color.CYAN);
//			graphics.fillRect(s, r, 50, 50);
//				}
//			 }
//
//	 }	 			
//		//Challenge #11 
		// Extra Credit Star
		
		for (int i = 0; i < 120; i++)
			{
		int [] xIntercepts = {30, 60, 90, 70, 100, 70, 60, 55, 30, 42};
		int [] yIntercepts = {20, 40, 20, 55, 80, 70, 100, 70, 80, 50};
		graphics.setColor(new Color(215, 13, 100));
		graphics.fillPolygon(xIntercepts, yIntercepts, 10);
	
	    
			}
		}
		
		
 	      
  		
		
		 public void delay()
	 			{
	 	        try
						{
	 					Thread.sleep(50);
						}catch (InterruptedException e)
	 					{
	 					e.printStackTrace();
	 					}
	 	        
		
		
		
		
		
		
		
		
		
	
		}

	}
