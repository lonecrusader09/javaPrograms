import java.awt.*;
import java.awt.event.*;

class framedemo2 extends Frame 
{
	TextField t;
	Button b;
	framedemo2()
	{
		
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		setLayout(new FlowLayout());
		t = new TextField(15);
		b = new Button("Click Here");
		add(t);
		add(b);

	}



public static void main(String [] args)
{
	framedemo2 f = new framedemo2();
	f.setVisible(true);
	f.setSize(400,400);
}
}

