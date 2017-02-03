import java.awt.*;
import javax.swing.*;

public class DrawSqu extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				DrawSqu canvas = new DrawSqu();
				JFrame frame = new JFrame();
				frame.setSize(300, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(false);
				frame.setVisible(true);
			}

		public void paint(Graphics graphics)
			{

				graphics.setColor(Color.red);
				graphics.drawRect(20, 10, 250, 250);

			}
	}