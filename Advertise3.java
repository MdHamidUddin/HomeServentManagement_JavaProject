
package home.servant.finder;
import static home.servant.finder.Advertise2.Color1;
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


public class Advertise3 extends JFrame 

{
    JPanel jpanel=new JPanel();
    JLabel label1;
    JButton btn1,btn2,btn3,btn4,btn5,btn7;
       JTextField name,salary,phone,addr;  
     JLabel label2,lname,lphone,lsalary;
    Component comp=SwingUtilities.getRoot(this);
    public static final Color Color1=new Color(242, 10, 107);
    public static final Color Color2=new Color(242, 10, 107);
     int Serial;
      int ln;
      File f=new File("D:\\Home Servant Finder");
 Advertise3(int serial)
 {
    super("Alu potti");  
    Serial=serial;
   setVisible(true);
   setBounds(500,100,550,800);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   jpanel.setLayout(null);
    JTextField field1,field2,field3,field4;
   jpanel.setBackground(Color1);
   add(jpanel);
   
   
   label1=new JLabel("Start Post For Alu Potty");
   label1.setFont(new Font("Arial",Font.PLAIN,30));
   label1.setForeground(Color.black);
   label1.setBounds(50,15,400,200);
   jpanel.add(label1);
   
   label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.BLACK);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);
   
    
    name=new JTextField("");
    name.setFont(new Font("Time New Roman",Font.PLAIN,18));
    name.setBackground(Color.white);
    name.setForeground(Color.black);   
    name.setBounds(300,250,250,30);
    jpanel.add(name);
    
    phone=new JTextField("");
    phone.setFont(new Font("Time New Roman",Font.PLAIN,18));
    phone.setBackground(Color.white);
    phone.setForeground(Color.black);   
    phone.setBounds(300,290,250,30);
    jpanel.add(phone);
    
    salary=new JTextField("");
    salary.setFont(new Font("Time New Roman",Font.PLAIN,18));
    salary.setBackground(Color.white);
    salary.setForeground(Color.black);   
    salary.setBounds(300,330,250,30);
    jpanel.add(salary);
    
    btn1=new JButton("Post Add");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,18));
    btn1.setBackground(Color.blue);
    btn1.setForeground(Color.white);   
    btn1.setBounds(300,400,250,40);
    jpanel.add(btn1);
    
    
    
    
   lname=new JLabel("Work Name");
   lname.setFont(new Font("Arial",Font.PLAIN,20));
   lname.setForeground(Color.black);
   lname.setBounds(180,250,150,30);
   jpanel.add(lname);
    
       lphone=new JLabel("Phone");
   lphone.setFont(new Font("Arial",Font.PLAIN,20));
   lphone.setForeground(Color.black);
   lphone.setBounds(180,290,150,30);
   jpanel.add(lphone);
   
      lsalary=new JLabel("Salary");
   lsalary.setFont(new Font("Arial",Font.PLAIN,20));
   lsalary.setForeground(Color.black);
   lsalary.setBounds(180,330,150,30);
   jpanel.add(lsalary);
   
   
    btn7=new JButton("Back");
    btn7.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn7.setBackground(Color.blue);
    btn7.setForeground(Color.white);   
    btn7.setBounds(10,10,100,40);
    
    jpanel.add(btn7);
    
         HandlerClass handler=new HandlerClass();
   btn7.addActionListener(handler);
 btn1.addActionListener(handler);
 }
 
 
 
    void creatFolder()
     {
         if(!f.exists()){
             f.mkdirs();
         }
         
         }
     
     
     
     void readFile()
    {
        try {
            FileReader fr=new FileReader(f+"\\Advertise.txt");
            System.out.println("file exists !");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter(f+"\\Advertise.txt");
                System.out.println("File Created ");
            } catch (IOException ex1) {
              
            }
        }
         
    }
     
     
         void addData(String name,String phone,String salary )
    {
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\Advertise.txt","rw");
            for(int i=0;i<ln;i++)
            {
                raf.readLine();
            }
            raf.writeBytes("Location: Alu Potty "+"\n");
            raf.writeBytes("Work Name : "+name+ "\n");
            raf.writeBytes("Phone: "+phone+ "\n");
            raf.writeBytes("Salary : "+salary+ "\n");
            raf.writeBytes("\n");
            JOptionPane.showMessageDialog(null, "Successfully Posted Add " );
            
            
        } catch (FileNotFoundException ex) {
          
        } catch (IOException ex) {
          
        }
         
    }
     
     
     
     void countLines()
{
        try {
            ln=1;
            RandomAccessFile raf=new RandomAccessFile(f+"\\Advertise.txt","rw");
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
            addData(name.getText(),phone.getText(),salary.getText());
          ((Window)comp).dispose();
          SignIn s=new SignIn();
          s.setVisible(true);
        }
        else if(event.getSource()==btn7)
        {
          ((Window)comp).dispose();
          Category s=new Category(Serial);
          s.setVisible(true);
        }
        
    }
    
}
    
    
}
