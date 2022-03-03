package Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtTrial {
    public AwtTrial()
    //it is a constructor
    {
        //making a frame as an object
        Frame frame = new Frame("Hello World!");
        //making an object of textField and setting its boundary with bgColor
        TextField textField=new TextField();
        textField.setBounds(30, 400, 150, 70);
        textField.setBackground(Color.yellow);
        //making an object of Label and setting its boundary and bgColor
        Label label=new Label("Hey Nurbu");
        label.setBounds(30,40,200,100);
        label.setBackground(Color.green);
        //making an object of Label and setting its boundary and bgColor
        Button button = new Button("Click Me");
        button.setBounds(30, 150, 100, 200);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        //set new text with the click on button
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("New Version update");
            }
        });
        //making an object of checkbox
        Checkbox checkbox=new Checkbox("Nuru");
        checkbox.setBounds(30, 550, 100, 100);

        Checkbox checkbox1=new Checkbox("Geetu");
        checkbox1.setBounds(30, 630, 100, 100);

        //adding all the components in the frame
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(textField);
        frame.add(label);
        frame.add(button);

        //setting frame size, layout and visibility
        frame.setSize(500, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //frame closing after click on Window close
                frame.dispose();

            }
        });

    }
    public static void main(String[] args) {
        //creating an instance or object of class
        AwtTrial object1 = new AwtTrial();
    }
}
