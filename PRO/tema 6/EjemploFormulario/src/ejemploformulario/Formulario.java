package ejemploformulario;


import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {
    JPanel miCapa;
    JLabel nombreLabel;
    JLabel saludoLabel;
    JTextField nombreTF;
    JButton saludarB;
    JButton salirB;
    public Formulario(){
        this.setTitle("Aplicacion en Java");
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        miCapa = new JPanel();
        miCapa.setLayout(null);
        miCapa.setBackground(Color.BLACK);
        this.add(miCapa);
        
        nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(30, 20, 100, 30); // x y ancho alto
        nombreLabel.setForeground(Color.WHITE);
        miCapa.add(nombreLabel);
        
        nombreTF = new JTextField();
        nombreTF.setBounds(100, 20, 100, 30);
        nombreTF.setBackground(Color.WHITE);
        miCapa.add(nombreTF);
        
        saludoLabel = new JLabel();
        saludoLabel.setBounds(30, 80, 150, 30); // x y ancho alto
        saludoLabel.setForeground(Color.WHITE);
        miCapa.add(saludoLabel);
        
        saludarB = new JButton("Saludar");
        saludarB.setBounds(235, 225, 100, 30); 
        saludarB.setBackground(Color.WHITE);
        miCapa.add(saludarB);
        
        salirB = new JButton("Salir");
        salirB.setBounds(375, 225, 100, 30); 
        salirB.setBackground(Color.WHITE);
        
        saludarB.addActionListener(this);
        salirB.addActionListener(this);
        
        miCapa.add(salirB);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == salirB){
            System.exit(0);
        }
        if(e.getSource()==saludarB){
            saludoLabel.setText("Hola, " + nombreTF.getText() + ".");
        }
    }
}
