package forms;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.*;
import objects.Description;

public class InformationEquipmentForm extends JFrame {
    private ObjectContainer dataBase;
    private String name;
    private JPanel panel;
    private JLabel nameL;
    private JTextArea descriptionL;
    private JLabel imageL;
    private String image;
    private String desc;
    

    public InformationEquipmentForm(String name, ObjectContainer dataBase){
        this.name = name;
        this.dataBase = dataBase;

        // Основное окно
        this.setTitle("Description");
        this.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(850, 400));
        this.add(panel);

        getSourseImg(name);
        ImageIcon imageIcon = new ImageIcon(image);
        imageL = new JLabel(imageIcon);
        imageL.setBounds(10, 10, 512, 384);
        panel.add(imageL);
        
        descriptionL = new JTextArea();
        descriptionL.setEditable(false);
        descriptionL.setLineWrap(true);
        descriptionL.setWrapStyleWord(true);
        descriptionL.setBounds(532, 10, 280, 200);
        descriptionL.setFont(new Font("Arial", Font.PLAIN, 14)); // Set a custom font
        descriptionL.setForeground(Color.BLACK); // Set text color
        descriptionL.setBackground(Color.LIGHT_GRAY); // Set background color for better readability
        descriptionL.setMargin(new Insets(10, 10, 10, 10)); // Add padding inside the JTextArea
        descriptionL.setCaretColor(Color.BLACK); // Set caret color (the blinking cursor)

        panel.add(descriptionL);
        getTextFromDesc(name);

        this.pack();
        this.setLocationRelativeTo(null);
    }
    private void getSourseImg(String name){
        ObjectSet result = dataBase.queryByExample(new Description(name, null, null));
        while(result.hasNext()){
            Description info = (Description)result.next();
            this.image = info.getPhoto();
        }
    }
    private void getTextFromDesc(String name){
        ObjectSet result = dataBase.queryByExample(new Description(name, null, null));
        while(result.hasNext()){
            Description info = (Description)result.next();
            this.descriptionL.setText(name + "\n\n" + info.getDescription());
        }
    }
}