package home.servant.finder;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SignIn extends JFrame implements FILE
        
{
    File f=new File("D:\\Home Servant Finder");
    int ln=0;
    JPanel jpanel=new JPanel();
     JLabel label2,label1;
    JButton btn1,btn3;
    Component comp=SwingUtilities.getRoot(this);
    
    public static final Color Color1=new Color(245, 210, 247);
     public static final Color Color2=new Color(9, 19, 84);
     JTextField field2;
     JTextField field1;
 SignIn()
{
   super("Start here");   
   setVisible(true);
   setBounds(500,100,550,800);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   jpanel.setLayout(null);
   
   jpanel.setBackground(Color1);
   add(jpanel);
   
     label1=new   JLabel("Log In User Account");
    label1.setFont(new Font("Arial",Font.ITALIC,38));
    label1.setForeground (Color.black);
    label1.setBounds(125,30,600,200);
    jpanel.add(label1);
   
   
    btn1=new JButton("Login");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn1.setBackground(Color2);
    btn1.setForeground(Color.white);   
    btn1.setBounds(200,400,100,40);
    jpanel.add(btn1);
    
      btn3=new JButton("Back");
    btn3.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn3.setBackground(Color.blue);
    btn3.setForeground(Color.white);   
    btn3.setBounds(200,500,100,40);
    
    jpanel.add(btn3);
    
     label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.BLACK);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);
    
    field1=new JTextField("Password");
    field1.setFont(new Font("Time New Roman",Font.PLAIN,18));
    field1.setBackground(Color.white);
    field1.setForeground(Color.black);   
    field1.setBounds(150,300,230,50);
    jpanel.add(field1);
   
    
    field2=new JTextField("Phone Number");
    field2.setFont(new Font("Time New Roman",Font.PLAIN,18));
    field2.setBackground(Color.white);
    field2.setForeground(Color.black);   
    field2.setBounds(150,200,230,50);
    jpanel.add(field2);
   
    
     SignIn.HandlerClass handler=new SignIn.HandlerClass();
   btn1.addActionListener(handler);
    btn3.addActionListener(handler);
    
    
    
            field2.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (field2.getText().equals("Phone Number")) {
            field2.setText("");
            field2.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (field2.getText().isEmpty()) {
            field2.setForeground(Color.GRAY);
            field2.setText("Phone Number");
        }
    }
    });
    
    
            
              
            field1.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (field1.getText().equals("Password")) {
            field1.setText("");
            field1.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (field1.getText().isEmpty()) {
            field1.setForeground(Color.GRAY);
            field1.setText("Password");
        }
    }
    });
    
    
    
    
    
    
    
    
    
    
    
    
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
   
     
     void CheckData (String num,String pswd){
        boolean check=false;
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\login.txt","rw");
            for(int i=1;i<ln;i+=5){
                System.out.println("count"+i);
                
                String Num=raf.readLine().substring(7);
                raf.readLine();
                raf.readLine();       
                String Pass=raf.readLine().substring(10);
                raf.readLine();
                if(num.equals(Num) & pswd.equals(Pass)){
                    check=true;
                    
                    ((Window) comp).dispose();
                   Area s=new Area();
                   s.setVisible(true);
                    //JOptionPane.showMessageDialog(null, "Login Successfull !");
                    break;
                }
               
               
            }
            if(check==false)
            {
                 JOptionPane.showMessageDialog(null, "Wrong Phone/Password!");
            }
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
            CheckData(field2.getText(),field1.getText());
          
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
