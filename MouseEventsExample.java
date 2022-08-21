import java.awt.*;
import java.awt.event.*;
public class MouseEventsExample extends Frame implements MouseListener, MouseMotionListener  {
    String msg = "";
    int x, y;
    public MouseEventsExample() {
        setVisible(true);
        setSize(500,500);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me) {
        msg="Mouse Clicked";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent me) {
        msg="Mouse Dragged";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void mousePressed(MouseEvent me) {
        msg="Mouse Pressed";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent me) {
        msg="Mouse Released";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void mouseEntered(MouseEvent me) {
        msg="Mouse Entered";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void mouseExited(MouseEvent me) {
        msg="Mouse Exited";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent me) {
        msg="Mouse Moved";
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg,x,y);
    }
    public static void main(String a[]) {
        new MouseEventsExample();
    }
}