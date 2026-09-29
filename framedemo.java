import java.awt.*;
import java.awt.event.*;

class framedemo extends Frame implements WindowListener
{
	TextField t;
	Button b;
	framedemo()
	{
		addWindowListener(this);
		setLayout(new FlowLayout());
		t = new TextField(15);
		b = new Button("Click Here");
		add(t);
		add(b);

	}
public void windowClosing(WindowEvent e){System.exit(0);}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}

public static void main(String [] args)
{
	framedemo f = new framedemo();
	f.setVisible(true);
	f.setSize(400,400);
}
}