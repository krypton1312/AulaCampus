package ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form extends JFrame implements ActionListener{
    JPanel panel;
    JTextField lluviaTF;
    JLabel resultL;
    JLabel label;
    JButton comprobarB;
    public Form(){
        this.setTitle("Ejercicio2");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        this.add(panel);
        
        lluviaTF = new JTextField();
        lluviaTF.setBounds(190,30,100,30);
        panel.add(lluviaTF);
        
        label = new JLabel("Litros de lluvia recogidos:");
        label.setBounds(30,30,200,30);
        panel.add(label);
        
        resultL = new JLabel("");
        resultL.setBounds(90,110,100,30);
        panel.add(resultL);
        
        comprobarB = new JButton("Comprobar");
        comprobarB.setFocusable(false);
        comprobarB.setBounds(30, 70, 300, 30);
        comprobarB.addActionListener(this);
        panel.add(comprobarB);
        
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comprobarB){
            if(Integer.parseInt(lluviaTF.getText()) > 0){
                resultL.setText("LLUVIOSO");
            }else{
                resultL.setText("NO LLUVIOSO");
            }
        }
    }
}
