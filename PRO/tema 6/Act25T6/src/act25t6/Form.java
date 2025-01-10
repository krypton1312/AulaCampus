package act25t6;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Form extends JFrame implements ActionListener {
    JPanel panel;
    JLabel codigoL;
    JTextField codigoTF;
    JLabel datosL;
    JButton sacarDatosB;
    private Viaje[] viaje;
    public Form(Viaje[] viaje){
        this.viaje = viaje;
        this.setTitle("Act25T6");
        this.setSize(350, 260);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        this.add(panel);
        
        codigoL = new JLabel("Codigo: ");
        codigoL.setBounds(10, 10, 50, 40);
        codigoL.setForeground(Color.WHITE);
        panel.add(codigoL);
        
        codigoTF = new JTextField();
        codigoTF.setBounds(80, 10, 190, 40);
        codigoTF.setBackground(Color.WHITE);
        panel.add(codigoTF);
        
        datosL = new JLabel();
        datosL.setBounds(10, 60, 315, 100);
        datosL.setBackground(Color.WHITE);
        datosL.setOpaque(true);
        panel.add(datosL);
        
        sacarDatosB = new JButton("Informacion");
        sacarDatosB.setBounds(10, 170, 315, 40);
        sacarDatosB.setBackground(Color.WHITE);
        sacarDatosB.addActionListener(this);
        panel.add(sacarDatosB);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == sacarDatosB ){
            for (Viaje viaje1 : viaje) {
                if(viaje1.getCodigo().equals(codigoTF.getText())){
                    datosL.setText(viaje1.getTodosDatos());
                    break;
                }else{
                    datosL.setText("Error de datos. Codigo incorrecto.");
                }
            }
        }
    }
}
