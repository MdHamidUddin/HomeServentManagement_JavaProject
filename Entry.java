
package home.servant.finder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Entry extends JFrame
{
    JPanel jpanel=new JPanel();
    JLabel label1,label2;
    JButton btn1,btn2,btn3;
     Component comp=SwingUtilities.getRoot(this);
    public static final Color Color1=new Color(245, 210, 247);
    public static final Color Color2=new Color(9, 19, 84);
    public static final Color Color3=new Color(9, 19, 84);
     

    Entry()
    {
       super("Entry");
       setVisible(true);
       setBounds(500,100,550,800);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       jpanel.setLayout(null);
       jpanel.setBackground(Color1);
       add(jpanel); 
       
     label1=new   JLabel("Welcome to HomeServiceFinder");
    label1.setFont(new Font("Arial",Font.ITALIC,30));
    label1.setForeground (Color.black);
    label1.setBounds(40,50,600,200);
    jpanel.add(label1);
       
     label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.black);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);
    
     btn1=new JButton("Signup");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,18));
    btn1.setBackground(Color2);
    btn1.setForeground(Color.WHITE);   
    btn1.setBounds(80,300,150,50);
    
    btn2=new JButton("Signin");
    btn2.setFont(new Font("Time New Roman",Font.PLAIN,18));
    btn2.setBackground(Color3);
    btn2.setForeground(Color.WHITE);   
    btn2.setBounds(260,300,150,50);
    
     btn3=new JButton("Back");
    btn3.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn3.setBackground(Color.blue);
    btn3.setForeground(Color.white);   
    btn3.setBounds(200,500,100,40);
    
    jpanel.add(btn3);
     jpanel.add(btn1);
    jpanel.add(btn2);
    
     Entry.HandlerClass handler=new Entry.HandlerClass();
    btn1.addActionListener(handler);
    btn2.addActionListener(handler);
       
    }
    
    
    public class HandlerClass implements ActionListener
   {
    @Override
    public void actionPerformed(ActionEvent event)
    {
        
        if(event.getSource()==btn1)
        {
          ((Window)comp).dispose();
          SignUp s=new SignUp();
          s.setVisible(true);
        }
        else if(event.getSource()==btn2)
       {
      ((Window)comp).dispose();
          SignIn s=new SignIn();
          s.setVisible(true);
        }
        
    }
    
    }
    
}
