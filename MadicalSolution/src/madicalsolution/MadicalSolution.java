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

public class MadicalSolution implements ActionListener {

    JFrame frame;
    ImageIcon image;
    ImageIcon image2;
    JButton button;
    JLabel label, id;

    public MadicalSolution() {
        //button create
        button = new JButton("Click next");
        button.setBounds(500, 580, 200, 70);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.addActionListener(this);

        image = new ImageIcon("/home/jack/Desktop/project/medical.jpg");
        JLabel background = new JLabel(" ", image, JLabel.CENTER);
        background.setBounds(0, 70, 1100, 600);

        //label create
        label = new JLabel("Medical Soloution & Medical Advice");
        label.setBounds(50, 0, 1000, 90);
        label.setFont(new Font("serif", Font.PLAIN, 50));
        label.setForeground(Color.blue);

        //frame adding here
        frame = new JFrame("Medical Soloution & Medical Advice");
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setSize(new Dimension(1100, 700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);
        frame.add(background);
        frame.setVisible(true);

        //set lid of medical
        while (true) {
            label.setVisible(false);
            try {
                Thread.sleep(500);
                label.setForeground(Color.magenta);
            } catch (InterruptedException e) {
            }
            try {
                label.setVisible(true);
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == button) {
            frame.setVisible(false);
            Menu symptoms = new Menu();
        }
    }

    public static void main(String... args) {
        MadicalSolution m = new MadicalSolution();
    }
}
