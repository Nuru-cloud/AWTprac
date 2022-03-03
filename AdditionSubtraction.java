package Awt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionSubtraction {
    public static void main(String[] args) {
        //three textfield, and a two buttons
        JFrame jFrame = new JFrame("Addition Subtraction");
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        JTextField num1 = new JTextField();
        num1.setBounds(100, 20, 100, 20);
        JTextField num2 = new JTextField();
        num2.setBounds(100,60, 100, 20 );
        JTextField num3 = new JTextField();
        num3.setBounds(100, 100, 100, 20);

        JButton add = new JButton("add");
        add.setBounds(100, 150, 100, 20);

        JButton sub = new JButton("sub");
        sub.setBounds(250, 150, 100, 20);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int field1 = Integer.parseInt(num1.getText());
                int field2 = Integer.parseInt(num2.getText());
                int field3 = Integer.parseInt(num3.getText());
                int addition = field1 + field2 + field3;

                if (field1 < 1000 & field2 < 1000 & field3 <1000 ) {
                    JOptionPane.showMessageDialog(jFrame, "Addition is " + addition);
                }
                else{
                    JOptionPane.showMessageDialog(jFrame,
                            "error: " + JOptionPane.ERROR_MESSAGE);
                }
        }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fieldA = Integer.parseInt(num1.getText());
                int fieldB = Integer.parseInt(num2.getText());
                int fieldC = Integer.parseInt(num3.getText());
                int addition = fieldA + fieldB + fieldC;
                int subtraction = fieldA - fieldB - fieldC;
                System.out.println("subtraction is " + subtraction);
                JOptionPane.showMessageDialog(jFrame, "subtraction is " + subtraction);
            }
        });

        jFrame.add(num1);
        jFrame.add(num2);
        jFrame.add(num3);
        jFrame.add(add);
        jFrame.add(sub);

    }
}
