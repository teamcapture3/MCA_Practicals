import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class SwingSignal extends Applet implements ItemListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "";
	Checkbox stop, ready, go;
	CheckboxGroup cbg;
	public void init()
	{
		cbg = new CheckboxGroup();
		stop = new Checkbox("Stop", cbg, false);
		ready = new Checkbox("Ready", cbg, false);
		go = new Checkbox("Go", cbg, false);
		add(stop);
		add(ready);
		add(go);
		stop.addItemListener(this);
		ready.addItemListener(this);
		go.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg = cbg.getSelectedCheckbox().getLabel();
		g.drawOval(120, 60, 50, 50);
		g.drawOval(120, 120, 50, 50);
		g.drawOval(120, 180, 50, 50);
		if(msg.equals("Stop"))
		{
			g.setColor(new Color(204, 50, 50));
			g.fillOval(120, 60, 50, 50);
		}
		else if(msg.equals("Ready"))
		{
			g.setColor(new Color(231, 180, 22));
			g.fillOval(120, 120, 50, 50);
		}
		else
		{
			g.setColor(new Color(45, 201, 55));
			g.fillOval(120, 180, 50, 50);
		}
	}
}
