import java.awt.*;
import javax.swing.*;

public class BouncingSquare extends Canvas
	{
		static int i=0;
		static int j=0;

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				BouncingSquare canvas = new BouncingSquare();
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
				while(true)
					{
				for(i=0; i<=500; i++)
					{
						if(i==500)
							{
							for(j=500; j>=0; j--)
								{
									graphics.setColor(Color.green);
									graphics.fillRect(j, 230, 20, 20);
									
									delay();
									
									graphics.setColor(Color.black);
									graphics.drawRect(j, 230, 20, 20);
								}
							}
						graphics.setColor(Color.green);
						graphics.fillRect(i, 230, 20, 20);
						
						delay();
						
						graphics.setColor(Color.black);
						graphics.drawRect(i, 230, 20, 20);
						
					}
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