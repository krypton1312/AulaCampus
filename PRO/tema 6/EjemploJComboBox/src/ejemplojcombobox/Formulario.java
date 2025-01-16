package ejemplojcombobox;

import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {
    JPanel panel;
    JComboBox<String> modulosCB;
    JButton comprobarB;
    JLabel textL;
    JLabel imagen;
    ImageIcon foto;
    public Formulario(){
        this.setTitle("JComboBox");
        this.setSize(700, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        modulosCB = new JComboBox<>();
        modulosCB.addItem("PRO");
        modulosCB.addItem("EDE");
        modulosCB.addItem("BD");
        modulosCB.addItem("SI");
        modulosCB.addItem("LM");
        modulosCB.setBounds(30, 30, 100, 40);
        modulosCB.setSelectedIndex(2);
        panel.add(modulosCB);
        
        comprobarB = new JButton("Seleccionar");
        comprobarB.setBounds(180, 30, 130, 40);
        comprobarB.setFocusable(false);
        comprobarB.addActionListener(this);
        panel.add(comprobarB);
        
        textL = new JLabel("");
        textL.setBounds(30, 80, 200, 40);
        panel.add(textL);
        
        foto = new ImageIcon("imagen.jpg");
        imagen = new JLabel(foto);
        imagen.setBounds(30, 130, 512, 256);
        panel.add(imagen);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comprobarB){
            textL.setText("Has elegido: " + (String) modulosCB.getSelectedItem());
        }
    }
}