package Awt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String buttonLabel= actionEvent.getActionCommand();
        System.out.println(buttonLabel);
        //if else for button clicked
        if(buttonLabel.equalsIgnoreCase("North")){
            System.out.println("First Button CLicked");
        }else{
            System.out.println("Second Button CLicked");
        }
    }
}
// foreground events: events which require the direct interaction of user
//background: those events which doesn't require the interaction of end user are known as background events//
