import java.applet.Applet;
import java.awt.Graphics;
/* <applet code = "MessageApplet" width = 400 height = 400>
</applet> */
public class MessageApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello World",200,200);
    }
}