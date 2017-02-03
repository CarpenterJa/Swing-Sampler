import java.awt.*;
import javax.swing.*;

public class RGBSpectrum extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				RGBSpectrum canvas = new RGBSpectrum();
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
				for(int r=0; r<=255; r++)
					{
						for(int g=0; g<=255; g++)
							{
								for(int b=0; b<=255; b++)
									{
										graphics.setColor(new Color(r, g , b));
										graphics.fillRect(50, 50, 100, 100);
									}
							}
					}


			

			}
	}