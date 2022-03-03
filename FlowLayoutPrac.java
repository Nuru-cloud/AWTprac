package Awt;

import java.awt.*;

public class FlowLayoutPrac  {
    public static void main(String [] args){
    Frame frame = new Frame();
    frame.setSize(1000, 1000);
    frame.setVisible(true);
    frame.setLayout(new FlowLayout());
    Button b1= new Button("Button A");
    frame.add(b1);
    Button b2= new Button("Button B");
    frame.add(b2);
    Button b3= new Button("Button C");
    frame.add(b3);
    Button b4= new Button("Button D");
    frame.add(b4);
    Button b5= new Button("Button E");
    frame.add(b5);
    }
}
