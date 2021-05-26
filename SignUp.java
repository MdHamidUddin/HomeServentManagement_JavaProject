
package home.servant.finder;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.*;

public class SignUp extends JFrame implements FILE
        
{
    File f=new File("D:\\Home Servant Finder");
    int ln=0;
    JPanel jpanel=new JPanel();
    JLabel label2,label1,label5,label3,label4,label8;
    JButton  btn1,btn3;
    Component comp=SwingUtilities.getRoot(this);
    JTextField field3,field1,field2,field4;
    public static final Color Color1=new Color(245, 210, 247);
     public static final Color Color3=new Color(9, 19, 84);
 SignUp()
{
   super("Start here SignUp");   
   setVisible(true);
   setBounds(500,100,550,800);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   jpanel.setLayout(null);

   jpanel.setBackground(Color1);
   add(jpanel);
   
      label8=new   JLabel("Create New Account");
    label8.setFont(new Font("Arial",Font.ITALIC,50));
    label8.setForeground (Color.BLACK);
    label8.setBounds(50,20,600,200);
    jpanel.add(label8);
   
  
     label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.BLACK);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);

    label3=new JLabel("Phone number:");
    label3.setFont(new Font("Time New Roman",Font.PLAIN,20));
    label3.setBackground(Color.orange);
    label3.setForeground(Color.black);   
    label3.setBounds(55,200,160,50);
    jpanel.add(label3);
    
    label4=new JLabel("Email :");
    label4.setFont(new Font("Time New Roman",Font.PLAIN,20));
    label4.setBackground(Color.orange);
    label4.setForeground(Color.black);   
    label4.setBounds(130,260,130,50);
    jpanel.add(label4);
    
    
    label1=new   JLabel("Name :");
    label1.setFont(new Font("Arial",Font.PLAIN,20));
    label1.setForeground (Color.BLACK);
    label1.setBounds(130,340,130,50);
    jpanel.add(label1);
    
    
     label5=new   JLabel("Password :");
    label5.setFont(new Font("Arial",Font.PLAIN,20));
    label5.setForeground (Color.BLACK);
    label5.setBounds(100,410,130,50);
    jpanel.add(label5);
    
    
    field1=new JTextField("");
    field1.setFont(new Font("Time New Roman",Font.PLAIN,18));
    field1.setBackground(Color.white);
    field1.setForeground(Color.black);   
    field1.setBounds(200,200,200,50);
    jpanel.add(field1);
   
    
    field2=new JTextField("");
    field2.setFont(new Font("Time New Roman",Font.PLAIN,18));
    field2.setBackground(Color.white);
    field2.setForeground(Color.black);   
    field2.setBounds(200,340,200,50);
    jpanel.add(field2);
    
    field3=new JTextField("");
    field3.setFont(new Font("Time New Roman",Font.PLAIN,18));
    field3.setBackground(Color.white);
    field3.setForeground(Color.black);   
    field3.setBounds(200,270,230,50);
    jpanel.add(field3);
    
    field4=new JTextField("");
    field4.setFont(new Font("Time New Roman",Font.PLAIN,18));
    field4.setBackground(Color.white);
    field4.setForeground(Color.black);   
    field4.setBounds(200,410,230,50);
    jpanel.add(field4);
   
    
     btn1=new JButton("SignUp");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn1.setBackground(Color3);
    btn1.setForeground(Color.WHITE);   
    btn1.setBounds(200,500,100,40);
    jpanel.add(btn1);
    
      btn3=new JButton("Back");
    btn3.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn3.setBackground(Color.blue);
    btn3.setForeground(Color.white);   
    btn3.setBounds(210,550,70,30);
    
    jpanel.add(btn3);
    
     HandlerClass handler=new HandlerClass();
   btn1.addActionListener(handler);
   btn3.addActionListener(handler);
    
    
}

    public void creatFolder()
     {
         if(!f.exists()){
             f.mkdirs();
         }
         
         }
     
     
     
    public void readFile()
    {
        try {
            FileReader fr=new FileReader(f+"\\Login.txt");
            System.out.println("file exists !");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter(f+"\\Login.txt");
                System.out.println("File Created ");
            } catch (IOException ex1) {
              
            }
        }
         
    }
     
     
         void addData(String phn,String email,String name,String pass )
    {
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\login.txt","rw");
            for(int i=0;i<ln;i++)
            {
                raf.readLine();
            }

            raf.writeBytes("Phone: "+phn+ "\n");
            raf.writeBytes("Email: "+email+ "\n");
            raf.writeBytes("Name: "+name+"\n");
            raf.writeBytes("Password: "+pass+"\n");
            raf.writeBytes("\n");
            JOptionPane.showMessageDialog(null, "Successfully Registered " );
            JOptionPane.showMessageDialog(null, "Now you can login with your Phohne Number & password " );
            
        } catch (FileNotFoundException ex) {
          
        } catch (IOException ex) {
          
        }
         
    }
     
     
     
    public void countLines()
{
        try {
            ln=1;
            RandomAccessFile raf=new RandomAccessFile(f+"\\login.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of lines :"+ln);
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
           
        }
}
     
     
     
     
   class HandlerClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==btn1)
        {
            
            creatFolder();
            readFile();
            countLines();
            addData(field1.getText(),field3.getText(),field2.getText(),field4.getText());
          ((Window)comp).dispose();
          SignIn s=new SignIn();
          s.setVisible(true);
        }
        else if(event.getSource()==btn3)
        {
          ((Window)comp).dispose();
          Entry s=new Entry();
          s.setVisible(true);
        }
        
    }
    
}
 
 
 
}

