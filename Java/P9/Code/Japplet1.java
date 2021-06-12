import java.awt.*;
import javax.swing.*;
public class Japplet1 extends JApplet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init()
  {
    Container content = getContentPane();
    content.setBackground(Color.white);
    content.setLayout(new FlowLayout()); 
    content.add(new JButton("Button 1"));
    content.add(new JButton("Button 2"));
    content.add(new JButton("Button 3"));
  }
}
