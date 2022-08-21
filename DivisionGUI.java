import java.awt.*;
import java.awt.event.*;
public class DivisionGUI extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b;
    int n1, n2;
    public DivisionGUI() {
        setVisible(true);
        setSize(300, 300);
        setBackground(Color.BLACK);
        setLayout(new FlowLayout());
        setFont(new Font("Arial", Font.BOLD,12));
        l1 = new Label("Enter NUM1: ");
        l1.setForeground(Color.WHITE);
        add(l1);
        t1 = new TextField(25);
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.BLACK);
        add(t1);
        l2 = new Label("Enter NUM2: ");
        l2.setForeground(Color.WHITE);
        add(l2);
        t2 = new TextField(25);
        t2.setBackground(Color.WHITE);
        t2.setForeground(Color.BLACK);
        add(t2);
        l3 = new Label("Result: ");
        l3.setForeground(Color.WHITE);
        add(l3);
        t3 = new TextField(25);
        t3.setBackground(Color.WHITE);
        t3.setForeground(Color.BLACK);
        add(t3);
        b = new Button("Compute");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.addActionListener(this);
        add(b);
    }
    public void actionPerformed(ActionEvent ae) {
        try {
            n1 = Integer.parseInt(t1.getText());
            n2 = Integer.parseInt(t2.getText());
            try {
                t3.setText(""+(n1/n2));
            }
            catch(ArithmeticException a) {
                t3.setText(a.getMessage());
            }
        }
        catch(NumberFormatException nfe) {
            t3.setText(""+nfe);
        }
    }
    public static void main(String s[]) {
        new DivisionGUI();
    }
}
