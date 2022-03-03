package Awt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordUsernameValidation {
//username password, validation: 10 characters only, username=admin and password=admin success
public static void main(String[] args) {
    JFrame jFrame = new JFrame("Username Password Validation");
    jFrame.setSize(300, 300);
    jFrame.setLayout(null);
    jFrame.setVisible(true);

    JTextField uname = new JTextField();
    uname.setBounds(100, 20, 100, 20);

    JTextField pass = new JTextField();
    pass.setBounds(100,60, 100, 20 );

    JButton jButton = new JButton("Login");
    jButton.setBounds(100,100,80, 20 );

jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String u1 = uname.getText();
            String u2 = pass.getText();

            if(u1.equalsIgnoreCase(u2) || u2.equalsIgnoreCase("admin")){
               JOptionPane.showMessageDialog(jFrame, "you can login now");
            };
        }
});
    jFrame.add(uname);
    jFrame.add(pass);
    jFrame.add(jButton);

}


}
