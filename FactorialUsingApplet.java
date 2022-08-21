import java.awt.*;
import java.awt.event.*;
public class FactorialUsingApplet extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1,t2;
    Button b;
    String str;
    int value, fact;
    public FactorialUsingApplet() {
        setVisible(true);
        setSize(250,250);
        setBackground(Color.BLACK);
        setLayout(new FlowLayout ());
        setFont(new Font("Arial", Font.BOLD, 12));
        l1 = new Label("Enter any number: ");
        add(l1);
        l1.setForeground(Color.WHITE);
        t1 = new TextField(25);
        add(t1);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        l2 = new Label("Factorial: ");
        add(l2);
        l2.setForeground(Color.WHITE);
        t2 = new TextField(25);
        add(t2);
        t2.setBackground(Color.BLACK);
        t2.setForeground(Color.WHITE);
        b = new Button("Compute");
        add(b);
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.addActionListener(this);
    }
    int factorial(int n) {
        int f=1;
        for(int i=2;i<=n;i++) {
            f*=i;
        }
        return f;
    }
    public void actionPerformed(ActionEvent ae) {
        str = ae.getActionCommand();
        if(str.equals("Compute")) {
            value = Integer.parseInt(t1.getText());
            fact = factorial(value);
            t2.setText(""+fact);
        }
    }
    public static void main(String s[]) {
        new FactorialUsingApplet();
    }
}