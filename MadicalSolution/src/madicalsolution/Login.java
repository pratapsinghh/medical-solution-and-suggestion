/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madicalsolution;

/**
 *
 * @author jack
 */
import java.awt.Event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{
    JFrame j;
    JButton b,b1,b3,b4;
    JTextField t1,t2;
    JTextArea a1,a2;
    ImageIcon image;
    JLabel l15,l1,l2,l,l3;
  Login()
  {
      image=new ImageIcon("/home/jack/Desktop/project/login.jpg");
      JLabel background=new JLabel("",image,JLabel.CENTER);
      background.setBounds(0,0,1000,980);
      
      l15=new JLabel();
      l15.setBounds(0,0,900,900);
      l15.setLayout(null);
      
      l=new JLabel("Only For Doctor Work");
      l.setBounds(400,10,400,100);
      l.setForeground(Color.cyan);
      l.setFont(new Font("serif",Font.PLAIN,22));
      l15.add(l);
      
      b3=new JButton("SignUp?");
      b3.setBounds(730,100,150,40);
      b3.setForeground(Color.blue);
      b3.setBackground(Color.BLACK);
      b3.setFont(new Font("serif",Font.PLAIN,18));
      l15.add(b3);
      
      l1=new JLabel("User_Name ");
      l1.setBounds(300,300,200,20);
      l1.setForeground(Color.cyan);
      l1.setFont(new Font("serif",Font.PLAIN,22));
      l15.add(l1);
      
      t1=new JTextField();
      t1.setBounds(440,300,200,30);
      l15.add(t1);
      
      l2=new JLabel("Password ");
      l2.setBounds(300,350,200,20);
      l2.setForeground(Color.cyan);
      l2.setFont(new Font("serif",Font.PLAIN,22));
      l15.add(l2);
      
      t2=new JPasswordField();
      t2.setBounds(440,350,200,30);
      l15.add(t2);
      
      b=new JButton("Sign_in");
      b.setBounds(420,400,100,40);
      b.setForeground(Color.blue);
      b.setBackground(Color.BLACK);
      l15.add(b);
      
      b1=new JButton("Cancel");
      b1.setBounds(550,400,100,40);
      b1.setForeground(Color.blue);
      b1.setBackground(Color.BLACK); 
      l15.add(b1);
      
       b4=new JButton("Forget_Password");
       b4.setBounds(550,470,200,30);
       b4.setForeground(Color.blue);
       b4.setBackground(Color.black);
       b4.setLayout(null);
       l15.add(b4);  
       
       
      JFrame frame=new JFrame();
      frame.setSize(new Dimension(900,900));
      frame.add(l15);
      frame.add(background);
      frame.setVisible(true);
  }
  public static void main(String[] args)
  {
      Login l=new Login();
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
