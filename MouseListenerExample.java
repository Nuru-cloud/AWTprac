package Awt;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static class BorderLayout1 {
       public static void main(String[] args){
       // creating object of frame
       Frame frame = new Frame("Border Layout");
       frame.setSize(1000, 1000);
       frame.setVisible(true);
      // setting the layout as BorderLayout()
       frame.setLayout(new BorderLayout());

       // creating buttons and adding on frame separating their borders respeactively
       Button b1 = new Button("North");
       frame.add(b1, BorderLayout.NORTH);
       Button button2 = new Button("South");
       frame.add(button2,BorderLayout.SOUTH);
       Button button3 = new Button("East");
       frame.add(button3, BorderLayout.EAST);
       Button button4 = new Button("West");
       frame.add(button4, BorderLayout.WEST);
       Button button5 = new Button("Center");
       frame.add(button5, BorderLayout.CENTER);

       }

    }
}
//in listener, we have to override all methods, non-abstract
