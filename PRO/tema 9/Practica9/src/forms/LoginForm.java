package forms;

import com.db4o.ObjectContainer;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class LoginForm extends JFrame {
    
    JPanel panel;
    JLabel textLoginL;
    JLabel loginL;
    JLabel passwordL;
    JTextField loginTF;
    JTextField passwordTF;
    JButton loginB;
    ObjectContainer user;
    
    public LoginForm(ObjectContainer user) {
        this.user = user;
        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(400, 500));
        this.add(panel);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        textLoginL = new JLabel("Login");
        textLoginL.setBounds(150, 30, 100, 40);
        panel.add(textLoginL);
    }
}
