import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.*;
public class SwingMovie extends JFrame implements ActionListener
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c; 
	private JLabel title; 
	private JLabel city; 
	private JTextField tcity; 
	private JLabel cinema; 
	private JTextField tcinema; 
	private JLabel movie; 
	private JTextField tmovie;
	private JLabel mclass; 
	private JRadioButton silver; 
	private JRadioButton gold; 
	private ButtonGroup mClass;
	private JLabel mdate; 
	private JComboBox<?> date; 
	private JComboBox<?> month; 
	private JComboBox<?> year;
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset; 
	private JButton receipt;
	private JTextArea tout; 
	private JLabel res; 
	private JTextArea resadd; 
	private String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29", "30","31"}; 
	private String months[] = { "Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sup", "Oct", "Nov", "Dec" }; 
	private String years[] = {	"1995", "1996", "1997", "1998","1999", "2000", "2001", "2002","2003", "2004", "2005", "2006","2007", "2008", "2009", "2010","2011", "2012", "2013", "2014","2015", "2016", "2017", "2018", "2019", "2020" };
	public SwingMovie() { setTitle("Movies"); setBounds(300, 90, 900, 600); setDefaultCloseOperation(EXIT_ON_CLOSE); setResizable(false);
	c = getContentPane(); c.setLayout(null);
	title = new JLabel("Movie Booking"); 
	title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	title.setSize(300, 30);
	title.setLocation(300, 30); 
	c.add(title);
	city = new JLabel("City"); 
	city.setFont(new Font("Arial", Font.PLAIN, 20)); 
	city.setSize(100, 20);
	city.setLocation(100, 100); 
	c.add(city);
	tcity = new JTextField(); tcity.setFont(new Font("Arial", Font.PLAIN, 15)); tcity.setSize(190, 20); tcity.setLocation(200, 100); c.add(tcity);
	cinema = new JLabel("Cinema"); cinema.setFont(new Font("Arial", Font.PLAIN, 20)); cinema.setSize(100, 20); cinema.setLocation(100, 150); c.add(cinema);
	tcinema = new JTextField(); tcinema.setFont(new Font("Arial", Font.PLAIN, 15)); tcinema.setSize(150, 20); tcinema.setLocation(200, 150); c.add(tcinema);
	movie = new JLabel("Movie"); movie.setFont(new Font("Arial", Font.PLAIN, 20)); movie.setSize(100, 20); movie.setLocation(100, 200); c.add(movie);
	tmovie = new JTextField(); tmovie.setFont(new Font("Arial", Font.PLAIN, 15)); tmovie.setSize(150, 20); tmovie.setLocation(200, 200); c.add(tmovie);
	mclass = new JLabel("Class"); mclass.setFont(new Font("Arial", Font.PLAIN, 20)); mclass.setSize(100, 20); mclass.setLocation(100, 250); c.add(mclass);
	silver = new JRadioButton("Silver"); silver.setFont(new Font("Arial", Font.PLAIN, 15)); silver.setSelected(true); silver.setSize(75, 20); silver.setLocation(200, 250); c.add(silver);
	gold = new JRadioButton("Gold"); gold.setFont(new Font("Arial", Font.PLAIN, 15)); gold.setSelected(false); gold.setSize(80, 20); gold.setLocation(275, 250); c.add(gold);
	mClass = new ButtonGroup(); mClass.add(silver); mClass.add(gold);
	mdate = new JLabel("Date"); mdate.setFont(new Font("Arial", Font.PLAIN, 20)); mdate.setSize(100, 20); mdate.setLocation(100, 300); c.add(mdate);
	date = new JComboBox<Object>(dates);
	date.setFont(new Font("Arial", Font.PLAIN, 15)); date.setSize(50, 20); date.setLocation(200, 300); c.add(date);
	month = new JComboBox<Object>(months);
	month.setFont(new Font("Arial", Font.PLAIN, 15)); month.setSize(60, 20); month.setLocation(250, 300); c.add(month);
	year = new JComboBox<Object>(years);
	year.setFont(new Font("Arial", Font.PLAIN, 15)); year.setSize(60, 20); year.setLocation(320, 300); c.add(year);
	term = new JCheckBox("Accept Terms And Conditions."); term.setFont(new Font("Arial", Font.PLAIN, 15)); term.setSize(250, 20); term.setLocation(150, 400); c.add(term);
	sub = new JButton("Submit");
	sub.setFont(new Font("Arial", Font.PLAIN, 15)); sub.setSize(100, 20); sub.setBackground(Color.green); sub.setLocation(150, 450); sub.addActionListener(this); c.add(sub);
	reset = new JButton("Reset");
	reset.setFont(new Font("Arial", Font.PLAIN, 15)); reset.setSize(100, 20); reset.setBackground(Color.white); reset.setLocation(270, 450); reset.addActionListener(this); c.add(reset);
	receipt = new JButton("Generate receipt"); receipt.setFont(new Font("Arial", Font.PLAIN, 15)); receipt.setSize(200, 20);
	receipt.setBackground(Color.orange); receipt.setLocation(540, 450); receipt.addActionListener(this); c.add(receipt);
	tout = new JTextArea();
	tout.setFont(new Font("Arial", Font.PLAIN, 15)); tout.setSize(300, 250); tout.setLocation(500, 100); tout.setLineWrap(true); tout.setEditable(false); c.add(tout);
	res = new JLabel("");
	res.setFont(new Font("Arial", Font.PLAIN, 20)); res.setSize(500, 25); res.setLocation(100, 500); c.add(res);
	resadd = new JTextArea();
	resadd.setFont(new Font("Arial", Font.PLAIN, 15)); resadd.setSize(200, 75); resadd.setLocation(580, 175); resadd.setLineWrap(true); c.add(resadd);
	setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) { String receipt = ""; if (e.getSource() == sub) { if (term.isSelected()) { String data1;
String data = "City : " + tcity.getText() + "\n" + "Cinema : " + tcinema.getText() + "\n"+ "Movie : " +
tmovie.getText() + "\n";
if (silver.isSelected()) data1 = "Class : Silver" + "\n";
else data1 = "Class : Gold" + "\n"; String data2 = "Date : " + (String)date.getSelectedItem()
+ "/" + (String)month.getSelectedItem()
+ "/" + (String)year.getSelectedItem() + "\n";
receipt = data + data1 + data2; tout.setText(receipt); tout.setEditable(false);
res.setText("Registration Successfully..");
}
else { tout.setText(""); resadd.setText("");
res.setText("Please accept the" + " terms & conditions..");
}}
else if (e.getSource() == reset) { String def = ""; tcity.setText(def); tcinema.setText(def); tmovie.setText(def);
tout.setText(def); term.setSelected(false); date.setSelectedIndex(0); month.setSelectedIndex(0); year.setSelectedIndex(0); resadd.setText(def);
}
else if (e.getSource() == receipt) { FileWriter writer = null; try { writer = new FileWriter("movie-receipt.txt");
} catch (IOException ioException) { ioException.printStackTrace();
}
BufferedWriter buffer = new BufferedWriter(writer); try { buffer.write(receipt);
} catch (IOException ioException) { ioException.printStackTrace();
}
try { buffer.close();
} catch (IOException ioException) { ioException.printStackTrace();
}}}}
class Registration
{ 
	private static SwingMovie f;

	public static void main(String[] args) throws Exception
	{
		setF(new SwingMovie());
	}

	public static SwingMovie getF() {
		return f;
	}

	public static void setF(SwingMovie f) {
		Registration.f = f;
	}
}

