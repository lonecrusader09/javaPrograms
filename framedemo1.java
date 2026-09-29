import java.awt.*;
import java.awt.event.*;

class framedemo1 extends Frame 
{
	TextField t;
	Button b;
	framedemo1()
	{
		sample s=new sample();
		addWindowListener(s);
		setLayout(new FlowLayout());
		t = new TextField(15);
		b = new Button("Click Here");
		add(t);
		add(b);

	}



public static void main(String [] args)
{
	framedemo1 f = new framedemo1();
	f.setVisible(true);
	f.setSize(400,400);
}
}

class sample extends WindowAdapter
{
public void windowClosing(WindowEvent e){System.exit(0);}
}