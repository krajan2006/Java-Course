package AWT;

import java.awt.*;
import java.awt.event.*;


class MyFrame15 extends Frame implements WindowListener
{
    Label l;
    
    MyFrame15()
    {
        super("Window Event Demo");
        l=new Label("No Message from Window");
        
        setLayout(new FlowLayout());
        add(l);
        
        addWindowListener(this);
        
    }

    @Override
    public void windowOpened(WindowEvent we)
    {
        l.setText("Window Opened");  
    }
    @Override
    public void windowClosing(WindowEvent e) 
    {
        l.setText("Window Closing");
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) 
    {
        l.setText("Window Closed");
    }
    @Override
    public void windowIconified(WindowEvent e) 
    {
        l.setText("Window Iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent e) 
    {
        l.setText("Window Deiconified");
    }
    @Override
    public void windowActivated(WindowEvent e) 
    {
        l.setText("Window Activated");
    }
    @Override
    public void windowDeactivated(WindowEvent e) 
    {
        l.setText("Window DeActivated");
    }
        
}

public class lHandlingWindowevent
{
    public static void main(String[] args) 
    {
        MyFrame15 f=new MyFrame15();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}