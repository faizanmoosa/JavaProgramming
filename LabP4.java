//Create UI to perform integer divisions.
//The user enters two numbers in text fields.
//Division of Num1 and Num2 is displayed in Result field, when Divide button is clicked.
//If Num1 or Num2 are not integer, program throws Number Format Exception.
//If Num2 were Zero, program throws Arithmetic Exception.
//Display the exception in a message dialog box.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LabP4 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b;
    public LabP4() {
        setVisible(true);
        setSize(350,500);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        l1 = new JLabel("Enter Num1: ");
        c.add(l1);
        t1 = new JTextField(25);
        c.add(t1);
        l2 = new JLabel("Enter Num2: ");
        c.add(l2);
        t2 = new JTextField(25);
        c.add(t2);
        l3 = new JLabel("Result: ");
        c.add(l3);
        t3 = new JTextField(25);
        c.add(t3);
        b = new JButton("Divide");
        c.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()=="Divide") {
            try {
                int p = Integer.parseInt(t1.getText());
                int q = Integer.parseInt(t2.getText());
                float r = (float)p/q;
                t3.setText(""+r);
            }
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this,nfe.getMessage());
            }
            catch(ArithmeticException are) {
                JOptionPane.showMessageDialog(this,are.getMessage());
            }
        }
    }
    public static void main(String args[]) {
        new LabP4();
    }
}