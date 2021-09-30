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
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Menu implements ActionListener{
    JButton b1,b2,b3,b4;
    JFrame frame;
    JLabel l15;
    public Menu()
    {
        ImageIcon image=new ImageIcon("/home/jack/Desktop/project/solution.jpg");
        JLabel background=new JLabel(" ",image,JLabel.LEFT);
        background.setBounds(10,20,1100,680);
        
        l15=new JLabel();
        l15.setBounds(0,0,1100,680);
        l15.setLayout(null);
        
        b1=new JButton("Symptoms");
        b1.setBounds(400,300,150,50);
        b1.setForeground(Color.CYAN);
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("serif",Font.PLAIN,18));
        b1.addActionListener(this);
        
        b2=new JButton("Solution");
        b2.setBounds(700,300,150,50);
         b2.setForeground(Color.CYAN);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("serif",Font.PLAIN,18));
        
        b3=new JButton("Check Medecin");
        b3.setBounds(400,380,150,50);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.CYAN);
        b3.setFont(new Font("serif",Font.PLAIN,18));
        
        b4=new JButton("Doctors");
        b4.setBounds(700,380,150,50);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.CYAN);
        b4.setFont(new Font("serif",Font.PLAIN,18));
        b4.addActionListener(this);
        
        frame=new JFrame();
        frame.setBackground(Color.red);
        frame.setLayout(null);
        frame.setSize(new Dimension(1100,680));
        frame.setVisible(true);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
    @Override
      public void actionPerformed(ActionEvent e)
      {
          if(e.getSource()==b1)
          {
              frame.setVisible(false);
              Symptoms s=new Symptoms() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }
              };
          }
              if(e.getSource()==b4)
              {
                  frame.setVisible(false);
                  Login l=new Login()
                  {
                      @Override
                      public void actionPerformed(ActionEvent e){
                          throw new UnsupportedOperationException("Not supported yet.");
                      
                      }
                  };
               }
          }
    public static void main(String[] args)
    {
        Menu m=new Menu();
    }
}
