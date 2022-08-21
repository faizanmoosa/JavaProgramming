import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UIforOpeningBankAcc extends JFrame implements ItemListener, ActionListener{
    JPanel jp1, jp2, jp3, jp4, jp5, jp6;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField tf1, tf2;
    JComboBox cb1;
    JCheckBox cb11;
    JButton b1;
    String temp = "";
    public UIforOpeningBankAcc(){
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        jp6 = new JPanel();
        JFrame f = new JFrame("Let's Get Started");
        f.setVisible(true);
        f.setTitle("Let's Get Started");
        f.setLayout(new FlowLayout());
        f.setSize(600,600);
        l1 = new JLabel("Note: Use Mobile Number linked to your Aadhaar.");
        jp1.add(l1);
        f.add(jp1);
        l2 = new JLabel("Mobile Number: ");
        jp2.add(l2);
        tf1 = new JTextField(25);
        jp2.add(tf1);
        f.add(jp2);
        l3 = new JLabel("Select: ");
        jp3.add(l3);
        String[] list = {"","PAN", "Date Of Birth"};
        cb1 = new JComboBox(list);
        cb1.addItemListener(this);
        jp3.add(cb1);
        f.add(jp3);
        l4 = new JLabel("Enter: ");
        jp4.add(l4);
        tf2 = new JTextField(25);
        jp4.add(tf2);
        f.add(jp4);
        cb11 = new JCheckBox(" ", false);
        jp5.add(cb11);
        l5 = new JLabel("I authorize Bank and its representatives to Call, SMS regarding my application.");
        jp5.add(l5);
        f.add(jp5);
        b1 = new JButton("Submit");
        jp6.add(b1);
        l6 = new JLabel("By clicking on SUBMIT. Bank PROCEEDS your application.");
        jp6.add(l6);
        f.add(jp6);
    }
    public void itemStateChanged(ItemEvent ie){
        if (ie.getSource() == cb1) {
            l4.setText ("Enter "+ cb1.getSelectedItem() +": ");
        }
    }
    public static void main(String a[]) {
        new UIforOpeningBankAcc();
    }
}