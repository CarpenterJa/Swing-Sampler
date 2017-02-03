import java.awt.*;
import javax.swing.*;

public class DrawRec extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				DrawRec canvas = new DrawRec();
				JFrame frame = new JFrame();
				frame.setSize(1000, 500);
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
				graphics.fillRect(100, 100, 800, 300);

			}
	}