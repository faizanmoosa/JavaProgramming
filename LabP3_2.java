//Receive an integer in one text field.
//Computes its factorial in another text field, when “Compute” is clicked.
import java.awt.*;
import java.awt.event.*;
public class LabP3_2 extends Frame implements ActionListener {
    TextField t1, t2;
    Label l1,l2;
    Button b;
    public LabP3_2() {
        setVisible(true);
        setSize(350, 500);
        setLayout(new FlowLayout());
        l1 = new Label("Enter any value: ");
        add(l1);
        t1 = new TextField(25);
        add(t1);
        l2 = new Label("Factorial: ");
        add(l2);
        t2 = new TextField(25);
        add(t2);
        b = new Button("Compute");
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()=="Compute") {
            long f = fact(Integer.parseInt(t1.getText()));
            t2.setText(""+f);
        }
    }
    public long fact(int n) {
        long f=1;
        while(n!=0) {
            f*=(n--);
        }
        return f;
    }
    public static void main(String args[]) {
        new LabP3_2();
    }
}
