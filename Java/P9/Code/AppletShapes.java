import java.awt.*;
import java.applet.*;
public class AppletShapes extends Applet
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init() {    }
    public void paint(Graphics g)
    {
        setBackground(Color.cyan);
        g.setColor(Color.green);
        g.fillRect(0,480,1900,3000);
        g.setColor(Color.gray);
        int []x4={850,1050,1250};
        int []y4={300,200,300};
        g.fillPolygon(x4,y4,3);
        g.setColor(Color.lightGray);
        g.fillRect(850,300,400,300);
        g.setColor(Color.white);
        g.drawRect(1100,350,100,100);
        g.drawLine(1100,400,1200,400);
        g.drawLine(1150,350,1150,450);
        g.setColor(Color.darkGray);
        g.fillRect(900,400,130,200);
        g.setColor(Color.yellow);
        g.fillArc(930,480,10,10,0,360);
        g.setColor(Color.black);
        g.fillRect(350,125,20,400);
        g.setColor(new Color(225, 153, 51));
        g.fillRect(370,130,350,50);
        g.setColor(Color.white);
        g.fillRect(370,180,350,50);
        g.setColor(new Color(19, 136, 8));
        g.fillRect(370,230,350,50);
        g.setColor(new Color(0, 0, 128));
        g.drawOval(500,180,50,50);
        int n1=525;
        int d1=205;
        double n2,d2;
        double angle= 0.0;
        double line=0.0;
        int r=23;
        for(int i=1;i<=24;i++)
        {
        	angle=(double)line*(3.14/180);
        	n2=n1+(double)r*Math.cos(angle);
        	d2=d1+(double)r*Math.sin(angle);
        	g.drawLine(n1,d1,(int)n2,(int)d2);
        	line=line+(360/24);
        }
    }
}
