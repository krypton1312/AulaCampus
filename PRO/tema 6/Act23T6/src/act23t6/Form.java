package act23t6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

public class Form extends JFrame implements ActionListener {
    JPanel panel;
    JLabel nameL;
    JTextField nameTF;
    JLabel dateL;
    JTextField dateTF;
    JLabel yearsL;
    JButton takeYearsB;
    public Form(){
        this.setTitle("Act23T6");
        this.setSize(350, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        this.add(panel);
        
        nameL = new JLabel("Nombre: ");
        nameL.setBounds(30, 30, 100, 30);
        nameL.setForeground(Color.WHITE);
        panel.add(nameL);
        
        nameTF = new JTextField("");
        nameTF.setBounds(150, 30, 150, 30);
        nameTF.setBackground(Color.WHITE);
        panel.add(nameTF);
        
        dateL = new JLabel("Fecha de nacimiento: ");
        dateL.setBounds(30, 70, 150, 30);
        dateL.setForeground(Color.WHITE);
        panel.add(dateL);
        
        dateTF = new JTextField("");
        dateTF.setBounds(150, 70, 150, 30);
        dateTF.setBackground(Color.WHITE);
        panel.add(dateTF);
        
        yearsL = new JLabel("");
        yearsL.setBounds(30, 110, 272, 30);
        yearsL.setBackground(Color.WHITE);
        yearsL.setOpaque(true);
        panel.add(yearsL);
        
        takeYearsB = new JButton("Calcular tu edad");
        takeYearsB.setBounds(30, 150, 272, 30);
        takeYearsB.setBackground(Color.WHITE);
        takeYearsB.setFocusable(false);
        takeYearsB.addActionListener(this);
        panel.add(takeYearsB);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == takeYearsB){
            LocalDate actualDate = LocalDate.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate inputDate = LocalDate.parse(dateTF.getText(), format);
            long years = ChronoUnit.YEARS.between(inputDate, actualDate);
            yearsL.setText(nameTF.getText() + " tu tienes " + years + " años.");
        }
    }
}
