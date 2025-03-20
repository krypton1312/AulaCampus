package forms;

import com.db4o.ObjectContainer;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class InformationEquipmentForm extends JFrame {
    private ObjectContainer dataBase;
    private String name;
    private JPanel panel;
    private JLabel nameL;
    private JLabel descriptonL;
    private JTextField descriptionTF;
    
    public InformationEquipmentForm(String name, ObjectContainer dataBase){
        this.name = name;
        this.dataBase = dataBase;
        
        this.setTitle("Description");
        this.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(620, 350));
        this.add(panel);
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
