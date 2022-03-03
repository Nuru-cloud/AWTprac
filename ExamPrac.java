package Awt;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;


public class ExamPrac  {
    public static void main(String [] args){
        JFrame frame = new JFrame("welcome");
        //set frame size, setVisible, layout
        frame.setSize(700, 700);


        JLabel jLabel = new JLabel("username:");
        jLabel.setBounds(20,20,80,50);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(110,20,80,50);

        JLabel jLabel1 = new JLabel("password:");
        jLabel1.setBounds(20, 80, 80, 50);
        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(110, 80, 80, 50);
        JButton jbutton = new JButton("submit");
        jbutton.setBounds(50, 150, 100, 50 );

        jbutton.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("submit button clicked");
            }
        });


	//adding all components in the frame
        frame.add(jLabel);
        frame.add(jTextField);
        frame.add(jLabel1);
        frame.add(jTextField1);
        frame.add(jbutton);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
