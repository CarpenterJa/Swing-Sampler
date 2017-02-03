import java.awt.*;
import javax.swing.*;


public class DrawX extends Canvas
	{

		private static final long	serialVersionUID	= 1L;
		 
    	public static void main(String[] args) 
    		{
	        DrawX canvas = new DrawX();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		
	        
	        graphics.setColor(Color.black);
	        graphics.drawLine(0, 0, 500, 400);
	        graphics.setColor(Color.black);
	        graphics.drawLine(500, 0, 0, 400);
	        
	        
	      
    	}
	}