
package home.servant.finder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Category extends JFrame 

{
    JPanel jpanel=new JPanel();
    JLabel label1,label2;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    
    Component comp=SwingUtilities.getRoot(this);
    public static final Color Color1=new Color(245, 210, 247);
    public static final Color Color2=new Color(242, 10, 107);
     public static final Color Color3=new Color(9, 19, 84);
     int Serial;
     
 Category(int serial)
 {
    super(" Types of Work");  
    Serial=serial;
   setVisible(true);
   setBounds(500,100,550,800);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   jpanel.setLayout(null);
    //JTextField field1,field2,field3,field4;
   jpanel.setBackground(Color1);
   
   add(jpanel);
   
   
   label1=new JLabel("Select Category");
   label1.setFont(new Font("Arial",Font.PLAIN,42));
   label1.setForeground(Color.black);
   label1.setBounds(130,15,500,200);
   jpanel.add(label1);
   
    label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.BLACK);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);
   
 
    btn2=new JButton("Room cleaner");
    btn2.setFont(new Font("Time New Roman",Font.PLAIN,17));
    btn2.setBackground(Color3);
    btn2.setForeground(Color.white);   
    btn2.setBounds(195,170,150,50);
    jpanel.add(btn2);


    btn3=new JButton("Nurse maid");
    btn3.setFont(new Font("Time New Roman",Font.PLAIN,16));
    btn3.setBackground(Color3);
    btn3.setForeground(Color.white);   
    btn3.setBounds(200,230,130,50);
    jpanel.add(btn3);
    
    btn4=new JButton("Laundry maid");
    btn4.setFont(new Font("Time New Roman",Font.PLAIN,16));
    btn4.setBackground(Color3);
    btn4.setForeground(Color.white);   
    btn4.setBounds(200,290,130,50);
    jpanel.add(btn4);

    btn5=new JButton(" Electrician");
    btn5.setFont(new Font("Time New Roman",Font.PLAIN,18));
    btn5.setBackground(Color3);
    btn5.setForeground(Color.white);   
    btn5.setBounds(200,350,130,50);
    jpanel.add(btn5);

    btn1=new JButton("Cooking maid");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,16));
    btn1.setBackground(Color3);
    btn1.setForeground(Color.white);   
    btn1.setBounds(195,420,140,50);
    jpanel.add(btn1);
    
    btn6=new JButton("Gatekeeper");
    btn6.setFont(new Font("Time New Roman",Font.PLAIN,16));
    btn6.setBackground(Color3);
    btn6.setForeground(Color.white);   
    btn6.setBounds(195,480,140,50);
    jpanel.add(btn6);
    
      btn7=new JButton("Back");
    btn7.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn7.setBackground(Color.blue);
    btn7.setForeground(Color.white);   
    btn7.setBounds(220,580,80,35);
    
    jpanel.add(btn7);
    
    HandlerClass handler=new HandlerClass();
     btn1.addActionListener(handler);
     btn2.addActionListener(handler);
     btn3.addActionListener(handler);
     btn4.addActionListener(handler);
     btn5.addActionListener(handler);
     btn6.addActionListener(handler);
     btn7.addActionListener(handler);
 }
    
   public class HandlerClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        
        if(event.getSource()==btn1 || event.getSource()==btn2 || event.getSource()==btn3 || event.getSource()==btn4 || event.getSource()==btn5 || event.getSource()==btn6 )
        {
             if(Serial==1)
        {
          ((Window)comp).dispose();
          Advertise1 s=new Advertise1(Serial);
          s.setVisible(true);
        }
    else if(Serial==2)
    {
     
          ((Window)comp).dispose();
          Advertise2 s=new Advertise2(Serial);
          s.setVisible(true);
        
    } 
    else if(Serial==3)
    {
     
          ((Window)comp).dispose();
          Advertise3 s=new Advertise3(Serial);
          s.setVisible(true);
        
    }
   else if(Serial==4)
    {
     
          ((Window)comp).dispose();
          Advertise4 s=new Advertise4(Serial);
          s.setVisible(true);
        
    }
          else if(Serial==5)
    {
     
          ((Window)comp).dispose();
          Advertise5 s=new Advertise5(Serial);
          s.setVisible(true);
        
    }  
   
        
             
             
        }
        else if(event.getSource()==btn7)
        {
            ((Window)comp).dispose();
          Area s=new Area();
          s.setVisible(true);
        }
        
       
        
    }
    
} 
}
