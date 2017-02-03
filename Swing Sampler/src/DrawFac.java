import java.awt.*;
import javax.swing.*;

public class DrawFac extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				DrawFac canvas = new DrawFac();
				JFrame frame = new JFrame();
				frame.setSize(1000, 725);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(false);
				frame.setVisible(true);
			}

		public void paint(Graphics graphics)
			{

				graphics.setColor(Color.green);
				graphics.fillOval(200, 50, 600, 600);

				graphics.setColor(Color.blue);
				graphics.fillRect(350, 200, 75, 75);
				
				graphics.setColor(Color.blue);
				graphics.fillRect(550, 200, 75, 75);
				
				graphics.setColor(Color.yellow);
				graphics.fillOval(410, 450, 150, 80);

			}
	}