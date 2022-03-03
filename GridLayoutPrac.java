package Awt;

import java.awt.*;

public class GridLayoutPrac {
        public static void main(String args[]){

        Frame frameObj= new Frame();

// creating 9 buttons
            Button btn1 = new Button("1");
            Button btn2 = new Button("2");
            Button btn3 = new Button("3");
            Button btn4 = new Button("4");
            Button btn5 = new Button("5");
            Button btn6 = new Button("6");
            Button btn7 = new Button("7");
            Button btn8 = new Button("8");
            Button btn9 = new Button("9");

/*
adding buttons to the frame since, we are using the parameterless constructor, therfore; the number of columns is equal to the number of buttons we are adding to the frame. The row count remains one.
 */
            frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);
            frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6);
            frameObj.add(btn7); frameObj.add(btn8); frameObj.add(btn9);

// setting the grid layout using the parameterless constructor
            frameObj.setLayout(new GridLayout());

            frameObj.setSize(300, 300);
            frameObj.setVisible(true);
        }
    }
