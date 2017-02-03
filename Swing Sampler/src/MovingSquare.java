import java.awt.*;
import javax.swing.*;

public class MovingSquare extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				MovingSquare canvas = new MovingSquare();
				JFrame frame = new JFrame();
				frame.setSize(500, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.black);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(false);
				frame.setVisible(true);
			}

		public void paint(Graphics graphics)
			{
				for(int i=0; i<500; i++)
					{
						graphics.setColor(Color.green);
						graphics.fillRect(i, i, 20, 20);
						
						delay();
						
						graphics.setColor(Color.black);
						graphics.drawRect(i, i, 20, 20);
						
					}

				

			}
		public void delay()
			{
	        try
					{
					Thread.sleep(10);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}