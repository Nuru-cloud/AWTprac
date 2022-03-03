package Awt;

//grid, border, card, flow
/*step 1- main class
2- main method
3- frame object
panel set up
grid object
cells setup
 */
import java.awt.*;

public class GridBagLayoutPrac {
    public static void main(String[] args){
        Frame frame = new Frame();
        frame.setSize(1000, 1000);
        frame.setVisible(true);


        Panel panel = new Panel();
        panel.setSize(1000, 1000);
        frame.add(panel);

        GridLayout gridLayout= new GridLayout(2, 2);
        panel.setLayout(gridLayout);

        Button button1 = new Button("First");
        panel.add(button1);
        Button button2 = new Button("Second");
        panel.add(button2);
        Button button3 = new Button("Third");
        panel.add(button3);
        Button button4 = new Button("Fourth");
        panel.add(button4);
    }
}
