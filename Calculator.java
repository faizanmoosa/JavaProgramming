import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
    TextField t;
    Button b[] = new Button[10];
    Button b1[] = new Button[6];
    String op[] = {"+","-","*","/","=","C"};
    int p, q;
    String oper, prev="";
    public Calculator() {
        setSize(300,200);
        setLayout(new GridLayout (5,4));
        setBackground(Color.BLACK);
        setFont(new Font("Arial",Font.BOLD,20));
        t = new TextField(25);
        t.setBackground(Color.DARK_GRAY);
        t.setText(""+0);
        for(int i=0;i<10;i++) {
            b[i]=new Button(""+i);
            add(b[i]);
            b[i].setBackground(Color.BLACK);
            b[i].addActionListener(this);
        }
        for(int i=0;i<6;i++) {
            b1[i]=new Button(op[i]);
            add(b1[i]);
            b1[i].setBackground(Color.BLACK);
            b1[i].addActionListener(this);
        }
        add(t);
        t.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("+")) {
            p=Integer.parseInt(t.getText());
            oper=str;
            prev="";
        }
        else if(str.equals("-")) {
            p=Integer.parseInt(t.getText());
            oper=str;
            prev="";
        }
        else if(str.equals("*")) {
            p=Integer.parseInt(t.getText());
            oper=str;
            prev="";
        }
        else if(str.equals("/")) {
            p=Integer.parseInt(t.getText());
            oper=str;
            prev="";
        }
        else if(str.equals("=")) {
            if(oper.equals("+")) {
                q=Integer.parseInt(t.getText());
                t.setText(""+(p+q));
                prev="";
            }
            else if(oper.equals("-")) {
                q=Integer.parseInt(t.getText());
                t.setText(""+(p-q));
                prev="";
            }
            else if(oper.equals("*")) {
                q=Integer.parseInt(t.getText());
                t.setText(""+(p*q));
                prev="";
            }
            else if(oper.equals("/")) {
                q=Integer.parseInt(t.getText());
                t.setText(""+(p/q));
                prev="";
            }
        }
        else if(str.equals("C")) {
            t.setText("");
            prev="";
        }
        else {
            t.setText(prev+str);
            prev+=str;
        }
    }
    public static void main(String s[]) {
        new Calculator();
    }
}