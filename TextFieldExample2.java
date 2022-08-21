import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldExample2 implements ActionListener
{
	static Frame f=new Frame("TextFieldExample2");
	static TextField nf,pf;
	static Label nl,pl;
	static String ns=new String("");
	static String ps=new String("");
	static Button b;
	public static void main(String s[])
	{
		nf=new TextField(20);
		pf=new TextField(20);
		pf.setEchoChar('*');
		nl=new Label("Name: ");
		pl=new Label("Password: ");
		b=new Button("Submit");
		b.addActionListener(this);
		f.add(nl);
		f.add(nf);
		f.add(pl);
		f.add(pf);
		f.add(b);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ns=nf.getText();
		ps=pf.getText();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name: "+ns,100,120);
		g.drawString("Password: "+ps,100,120);
	}
}
