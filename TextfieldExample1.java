import java.awt.*;
public class TextfieldExample1
{
	public static void main(String s[])
	{
		Frame f = new Frame("TextfieldExample1");
		TextField t1,t2;
		t1 = new TextField("Mohd Faizan Moosa, B.tech 2nd Year, Jaya Prakash Narayan College of Engineering");
		t1.setBounds(50,100,200,30);
		t2 = new TextField("Mohd Faizan Moosa, Software Engineer, Google");
		t2.setBounds(50,150,200,30);
		f.add(t1);
		f.add(t2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
