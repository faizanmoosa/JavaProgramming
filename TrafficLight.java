import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TrafficLight extends JFrame implements ItemListener {
    JLabel l;
    JRadioButton red, yellow, green;
    ButtonGroup bg;
    JFrame jf = new JFrame("Traffic Light");
    JPanel jp1, jp2;
    String str;
    public TrafficLight() {
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout(new GridLayout(2,1));
        jp1 = new JPanel();
        l = new JLabel();
        l.setFont(new Font("Arial", Font.BOLD, 36));
        jp1.add(l);
        jp2 = new JPanel();
        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");
        bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);
        jp2.add(red);
        jp2.add(yellow);
        jp2.add(green);
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
        jf.add(jp1);
        jf.add(jp2);
    }
    public void itemStateChanged(ItemEvent ie) {
        red.setForeground(Color.BLACK);
        yellow.setForeground(Color.BLACK);
        green.setForeground(Color.BLACK);
        if(ie.getSource()==red) {
            l.setText("Stop!");
            red.setForeground(Color.RED);
            l.setForeground(Color.RED);
        }
        else if(ie.getSource()==yellow) {
            l.setText("Ready!");
            yellow.setForeground(Color.YELLOW);
            l.setForeground(Color.YELLOW);
        }
        else if(ie.getSource()==green) {
            l.setText("Go!");
            green.setForeground(Color.GREEN);
            l.setForeground(Color.GREEN);
        }
    }
    public static void main(String s[]) {
        new TrafficLight();
    }
}
