import java.awt.*;
import javax.swing.*;

public class DrawBlu extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				DrawBlu canvas = new DrawBlu();
				JFrame frame = new JFrame();
				frame.setSize(1000, 1000);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(false);
				frame.setVisible(true);
			}

		public void paint(Graphics graphics)
			{

				graphics.setColor(Color.blue);
				graphics.drawRect(700, 700, 250, 250);
				graphics.setColor(Color.yellow);
				graphics.fillRect(701, 701, 249, 249);

			}
	}