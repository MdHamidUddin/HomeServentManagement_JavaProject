
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


public class Advertise6 extends JFrame 

{
    JPanel jpanel=new JPanel();
    JLabel label1,label2;
    JButton btn1,btn2,btn3,btn4,btn5,btn7;
    
    Component comp=SwingUtilities.getRoot(this);
    public static final Color Color1=new Color(242, 10, 107);
    public static final Color Color2=new Color(242, 10, 107);
     
 Advertise6(int serial)
 {
    super("Post 6");   
   setVisible(true);
   setBounds(500,100,550,800);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   jpanel.setLayout(null);
    JTextField field1,field2,field3,field4;
   jpanel.setBackground(Color1);
   add(jpanel);
   
   
   label1=new JLabel("Start Post For Laxmipur");
   label1.setFont(new Font("Arial",Font.PLAIN,30));
   label1.setForeground(Color.black);
   label1.setBounds(200,15,500,200);
   jpanel.add(label1);
   
    label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.BLACK);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);
   
    btn1=new JButton("Work name");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn1.setBackground(Color.blue);
    btn1.setForeground(Color.white);   
    btn1.setBounds(200,485,100,40);
    jpanel.add(btn1);
    
    btn2=new JButton("sellery");
    btn2.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn2.setBackground(Color.orange);
    btn2.setForeground(Color.black);   
    btn2.setBounds(110,200,130,50);
    jpanel.add(btn2);


    btn3=new JButton("Phone number");
    btn3.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn3.setBackground(Color.orange);
    btn3.setForeground(Color.black);   
    btn3.setBounds(107,270,130,50);
    jpanel.add(btn3);
    
    btn4=new JButton("Address");
    btn4.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn4.setBackground(Color.orange);
    btn4.setForeground(Color.black);   
    btn4.setBounds(100,340,130,50);
    jpanel.add(btn4);

    
   btn7=new JButton("Back");
    btn7.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn7.setBackground(Color.blue);
    btn7.setForeground(Color.white);   
    btn7.setBounds(200,500,100,40);
    
    jpanel.add(btn7);
 }
    
    
}
