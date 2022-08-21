import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class TableDemo extends JFrame
{
    int i=0;
    int j=0;
    Object TabData[][]=new Object[5][2];
    JTable t;
    FileInputStream f;
    DataInputStream in;
    Container c;
    public TableDemo()
    {
        String str="";
        c=getContentPane();
        c.setLayout(new BorderLayout());
        String[] column={"",""};
        try
        {
            FileInputStream f=new FileInputStream("table.txt");
            DataInputStream in=new DataInputStream(f);
            if((str=in.readLine())!=null)
            {
                StringTokenizer s1=new StringTokenizer(str,",");
                while(s1.hasMoreTokens())
                {
                    for(int k=0;k<2;k++)
                    column[k]=s1.nextToken();
                }
            }
            while((str=in.readLine())!=null)
            {
                StringTokenizer s1=new StringTokenizer(str,",");
                while(s1.hasMoreTokens())
                {
                    for(int j=0;j<2;j++)
                    {
                        TabData[i][j]=s1.nextToken();
                    }
                    i++;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        t=new JTable(TabData,column);
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane s= new JScrollPane(t,v,h);
        c.add(s,BorderLayout.CENTER);
    }
    public static void main(String s[])
    {
        TableDemo t=new TableDemo();
        t.setSize(300,300);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}