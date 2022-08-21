import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabP7 extends JFrame implements ItemListener {
    JRadioButton red, green, yellow;
    JLabel l;
    ButtonGroup bg;
    JPanel p1,p2;
    JFrame jf= new JFrame("Traffic Light Demo");

    public LabP7() {
        p1=new JPanel();
        p2=new JPanel();
        jf.setLayout(new GridLayout(2,1));
        red = new JRadioButton("RED");
        green = new JRadioButton("GREEN");
        yellow = new JRadioButton("YELLOW");
        l = new JLabel(" ");
        bg = new ButtonGroup();
        l.setFont(new Font("Serif", Font.BOLD, 30));

        bg.add(red);
        bg.add(green);
        bg.add(yellow);
        p1.add(l);
        p2.add(red);
        p2.add(green);
        p2.add(yellow);
        

        jf.add(p1);
        jf.add(p2);
       
        red.addItemListener(this);
        green.addItemListener(this);
        yellow.addItemListener(this);

        jf.setSize(500, 200);
        jf.setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
        red.setForeground(Color.BLACK);
        yellow.setForeground(Color.BLACK);
        green.setForeground(Color.BLACK);

        if (e.getSource() == red) {
            l.setText("STOP!");
            l.setForeground(Color.RED);
            red.setForeground(Color.RED);

        }
        if (e.getSource() == green) {
            l.setText("GO!");
            l.setForeground(Color.GREEN);
            green.setForeground(Color.GREEN);

        }
        if (e.getSource() == yellow) {
            l.setText("READY");
            l.setForeground(Color.YELLOW);
            yellow.setForeground(Color.YELLOW);

        }
    }

    public static void main(String[] args) {
        new LabP7();
    }
}