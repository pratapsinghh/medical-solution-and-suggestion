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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Symptoms implements ActionListener{
    
   JFrame frame;
   JLabel l1,l2,l3,l4,l15,l5,label1,l16;
   JTextField t1,t2,t3,t4;
   JButton b1,b2;
   JTextArea text;
   Symptoms()
   {
        ImageIcon image=new ImageIcon("/home/jack/Desktop/project/symptoms.jpg");
        JLabel background=new JLabel("",image,JLabel.LEFT);
        background.setBounds(590,-50,744,828);
        
        //Button setting
        b1=new JButton("Submit");
        b1.setBounds(100,590,150,50);
        b1.setFont(new Font("serif",Font.PLAIN,18));
        b1.setForeground(Color.white);
        b1.setBackground(Color.gray);
        
        b2=new JButton("Cancel");
        b2.setBounds(300,590,150,50);
        b2.setFont(new Font("serif",Font.PLAIN,18));
        b2.setForeground(Color.white);
        b2.setBackground(Color.gray);
        
        //label setting
        l15=new JLabel();
        l15.setBounds(0,0,1200,1200);
        l15.setLayout(null);
   
        //label setting
        l1=new JLabel("Patitient Detail-:");
        l1.setBounds(100,50,500,50);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("serif",Font.BOLD,22));
        l15.add(l1);
        
        //label setting
        l2=new JLabel("Name-:");
        l2.setBounds(100,120,500,50);
        l2.setForeground(Color.black);
        l2.setFont(new Font("serif",Font.BOLD,22));
        l15.add(l2);
        
        //button setting
        t1=new JTextField();
        t1.setBounds(188,130,100,30);
        l15.add(t1);
        
        //label setting
        l3=new JLabel("Mobile No. -:");
        l3.setBounds(300,120,500,50);
        l3.setForeground(Color.black);
        l3.setFont(new Font("serif",Font.BOLD,22));
        l15.add(l3);
        
        //button setting
        t2=new JTextField();
        t2.setBounds(469,130,160,30);
        l15.add(t2);
        
        //label setting
        l4=new JLabel("Email_Id-:");
        l4.setBounds(250,200,500,50);
        l4.setForeground(Color.black);
        l4.setFont(new Font("serif",Font.BOLD,22));
        l15.add(l4);
        
        //button setting
        t3=new JTextField();
        t3.setBounds(390,210,200,30);
        l15.add(t3);
        
        //label setting
        l5=new JLabel("Age-:");
        l5.setBounds(100,200,500,50);
        l5.setForeground(Color.black);
        l5.setFont(new Font("serif",Font.BOLD,22));
        l15.add(l5);
        
        //button setting
        t4=new JTextField();
        t4.setBounds(180,210,60,30);
        l15.add(t4);
        
        //label setting
        label1=new JLabel("Symptoms");
        label1.setBounds(100,290,500,50);
        label1.setForeground(Color.blue);
        label1.setFont(new Font("serif",Font.BOLD,22));
        l15.add(label1);
        
        //Text area
        text=new JTextArea("write the Symptoms",15,30);
        text.setBounds(100,350,400,150);
        text.setFont(new Font("serif",Font.PLAIN,18));
        text.setForeground(Color.black);
        text.setBackground(Color.GRAY);
        
        //Frame setting
        frame=new JFrame("Symptoms");
        frame.setBackground(Color.blue);
        frame.setLayout(null);
        frame.setSize(new Dimension(1280,1280));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(b1);
        frame.add(b2);
        frame.add(l15);
        frame.add(text);
        frame.add(background);
        
        
   }
   public static void main(String... args)
   {
       Symptoms s=new Symptoms() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
   }
}
