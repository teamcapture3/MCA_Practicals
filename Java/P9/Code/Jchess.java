import java.awt.*;
import java.applet.*;
public class Jchess extends Applet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g)
	{
		Font myFont = new Font("Courier", Font. BOLD,20);
		g. setFont(myFont);
		g.drawString("CHESS BOARD", 40, 30 );
		g.setColor(Color.black);
		g.fillRect(49,49,252,252);
		int x, y;
		for (int row = 2; row < 12; row++)
		{
			for (int col = 2; col < 12; col++)
			{
				x = row * 25;
				y = col * 25;
				if ((row % 2 == 0) == (col % 2 == 0))
					g.setColor(Color.BLACK);
				else
					g.setColor(Color.WHITE);
				g.fillRect(x, y, 25, 25);
			}
		}
	}
}
