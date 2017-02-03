import java.awt.*;
import javax.swing.*;

public class Star extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				Star canvas = new Star();
				JFrame frame = new JFrame();
				frame.setSize(100, 100);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.black);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(true);
				frame.setVisible(true);
			}

		public void paint(Graphics graphics)
			{

				int[] x =
					{ 50, 60, 80, 60, 80, 50, 20, 40, 20, 40 };
				int[] y =
					{ 20, 40, 40, 60, 80, 65, 80, 60, 40, 40 };
				graphics.setColor(Color.yellow);
				graphics.fillPolygon(x, y, 10);
			}
	}