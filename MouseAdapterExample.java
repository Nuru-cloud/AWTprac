package Awt;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.out.println("Clicked mouse");
    }
}
//adapter is a class which is abstract
