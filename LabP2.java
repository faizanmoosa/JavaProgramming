//Simple calculator.
//Grid layout to arrange buttons for digits & +, -, *, %.
//Text field to display result.
//Handle divided by zero.
import java.awt.*;
import java.awt.event.*;
public class LabP2 extends Frame implements ActionListener {
    Button b[] = new Button[10];
    Button b1[] = new Button[6];
    String s[] = {"+","-","*","/","=","C"};
    TextField tf;
    int p, q;
    String oper = "", prev = "";
    public LabP2() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new GridLayout(5,4));
        for(int i=0; i<10; i++) {
            b[i] = new Button(""+i);
            add(b[i]);
            b[i].addActionListener(this);
        }
        for(int i=0;i<6;i++) {
            b1[i] = new Button(s[i]);
            add(b1[i]);
            b1[i].addActionListener(this);
        }
        tf = new TextField(20);
        tf.setText("0");
        add(tf);
        tf.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        String temp = ae.getActionCommand();
        if(temp == "+") {
            p = Integer.parseInt(tf.getText());
            oper = temp;
            prev = "";
        }
        else if(temp == "-") {
            p = Integer.parseInt(tf.getText());
            oper = temp;
            prev = "";
        }
        else if(temp == "*") {
            p = Integer.parseInt(tf.getText());
            oper = temp;
            prev = "";
        }
        else if(temp == "/") {
            p = Integer.parseInt(tf.getText());
            oper = temp;
            prev = "";
        }
        else if(temp == "C") {
            tf.setText("0");
        }
        else if(temp == "=") {
            q = Integer.parseInt(tf.getText());
            if(oper == "+") {
                tf.setText(""+(p+q));
                prev = "";
                oper = "";
            }
            else if(oper == "-") {
                tf.setText(""+(p-q));
                prev = "";
                oper = "";
            }
            else if(oper == "*") {
                tf.setText(""+(p*q));
                prev = "";
                oper = "";
            }
            else if(oper == "/") {
                tf.setText(""+(p/q));
                prev = "";
                oper = "";
            }
        }
        else {
            tf.setText(prev+temp);
            prev+=temp;
        }
    }
    public static void main(String args[]) {
        new LabP2();
    }
}