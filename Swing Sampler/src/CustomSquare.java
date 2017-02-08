import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class CustomSquare extends Canvas
	{
		static int size;
		static int color;

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				squareSize();
				CustomSquare canvas = new CustomSquare();
				JFrame frame = new JFrame();
				frame.setSize(500, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.black);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(true);
				frame.setVisible(true);
			}
		public static void squareSize()
		{
			Scanner input=new Scanner(System.in);
			System.out.println("How big would you like yourse square between 1-400?");
			size=input.nextInt();
			System.out.println("Would you like it to be 1)blue or 2)red?");
			color=input.nextInt();
			
		}

		public void paint(Graphics graphics)
			{
				if(color==1)
					{
						graphics.setColor(Color.blue);
					}
				else
					{
						graphics.setColor(Color.red);
					}

				graphics.fillRect(10, 10, size, size);

			}
	}