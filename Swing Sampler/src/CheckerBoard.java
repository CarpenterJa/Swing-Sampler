import java.awt.*;
import javax.swing.*;

public class CheckerBoard extends Canvas
	{

		private static final long serialVersionUID = 1L;

		public static void main(String[] args)
			{
				CheckerBoard canvas = new CheckerBoard();
				JFrame frame = new JFrame();
				frame.setSize(800, 800);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of
													// screen
				frame.setResizable(true);
				frame.setVisible(true);
			}

		public void paint(Graphics graphics)
			{
				int x = 0;
				int y = 0;
				for (int i = 0; i < 8; i++)
					{
						for (int j = 0; j < 8; j++)
							{
								if (i % 2 == 0)
									{
										if (j % 2 == 0)
											{
												graphics.setColor(Color.red);
												graphics.fillRect(x, y, 100, 100);
											} else
											{
												graphics.setColor(Color.black);
												graphics.fillRect(x, y, 100, 100);
											}
									} else
									{
										if (j % 2 == 0)
											{
												graphics.setColor(Color.black);
												graphics.fillRect(x, y, 100, 100);
											} else
											{
												graphics.setColor(Color.red);
												graphics.fillRect(x, y, 100, 100);
											}
									}
								x = x + 100;

							}
						x = 0;
						y = y + 100;
					}

			}
	}