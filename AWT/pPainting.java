package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame22 extends Frame
{
    int x=0,y=0;
    
    MyFrame22()
    {
        super("Painting");
     
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.setFont(new Font("Luminari",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
    
}

public class pPainting 
{
    public static void main(String[] args) 
    {
        MyFrame22 f=new MyFrame22();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}