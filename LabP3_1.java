//Frame displays a message.
import java.awt.*;
public class LabP3_1 extends Frame {
    Label l;
    public LabP3_1() {
        setVisible(true);
        setSize(500, 500);
        l = new Label("Welcome to Java Programming");
        add(l);
    }
    public static void main(String args[]) {
        new LabP3_1();
    }
}