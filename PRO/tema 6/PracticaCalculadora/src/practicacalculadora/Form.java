package practicacalculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class Form extends JFrame implements ActionListener, MouseListener{
    JPanel panel;
    JLabel resultL;
    JTextField num1TF;
    JTextField num2TF;
    JButton[] actionB = new JButton[4];
    JButton calcularB;
    JButton salirB;
    public Form(){
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(650, 350)); // Устанавливаем точные размеры панели
        this.add(panel);
        
        resultL = new JLabel("Resultado");
        resultL.setBounds(10, 30, 630, 40);
        resultL.setBackground(Color.WHITE);
        resultL.setOpaque(true);
        resultL.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(resultL);
        
        num1TF = new JTextField("Clickea para introducir numero 1");
        num1TF.setBounds(10, 80, 310, 40);
        num1TF.setBackground(Color.WHITE);
        num1TF.setHorizontalAlignment(SwingConstants.CENTER);
        num1TF.setEditable(false);
        num1TF.addMouseListener(this);
        panel.add(num1TF);

        
        num2TF = new JTextField("Clickea para introducir numero 2");
        num2TF.setBounds(330, 80, 310, 40);
        num2TF.setBackground(Color.WHITE);
        num2TF.setEditable(false);
        num2TF.setHorizontalAlignment(SwingConstants.CENTER);
        num2TF.addMouseListener(this);
        panel.add(num2TF);
        
        actionB[0] = new JButton("Suma");
        actionB[0].setBounds(10, 130, 150, 40);
        actionB[0].setBackground(Color.WHITE);
        actionB[0].setFocusable(false);
        actionB[0].addActionListener(this);
        panel.add(actionB[0]);
        
        actionB[1] = new JButton("Resta");
        actionB[1].setBounds(170, 130, 150, 40);
        actionB[1].setBackground(Color.WHITE);
        actionB[1].setFocusable(false);
        actionB[1].addActionListener(this);
        panel.add(actionB[1]);

        actionB[2] = new JButton("Multiplica");
        actionB[2].setBounds(330, 130, 150, 40);
        actionB[2].setBackground(Color.WHITE);
        actionB[2].setFocusable(false);
        actionB[2].addActionListener(this);
        panel.add(actionB[2]);
        
        actionB[3] = new JButton("Divide");
        actionB[3].setBounds(490, 130, 150, 40);
        actionB[3].setBackground(Color.WHITE);
        actionB[3].setFocusable(false);
        actionB[3].addActionListener(this);
        panel.add(actionB[3]);
        
        calcularB = new JButton("Calcular");
        calcularB.setBounds(10, 180, 630, 40);
        calcularB.setBackground(Color.WHITE);
        calcularB.setFocusable(false);
        calcularB.addActionListener(this);
        panel.add(calcularB);
        
        salirB = new JButton("Salir");
        salirB.setBounds(10, 230, 630, 40);
        salirB.setBackground(Color.WHITE);
        salirB.setFocusable(false);
        salirB.addActionListener(this);
        panel.add(salirB);
        
        // Устанавливаем размер окна на основе панели
        this.pack();
        this.setLocationRelativeTo(null); // Центрируем окно
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == actionB[0]){
            for (JButton actionB1 : actionB) {
                actionB1.setEnabled(true);
            }
            actionB[0].setEnabled(false);
        }
        if(e.getSource() == actionB[1]){
            for (JButton actionB1 : actionB) {
                actionB1.setEnabled(true);
            }
            actionB[1].setEnabled(false);
        }
        if(e.getSource() == actionB[2]){
            for (JButton actionB1 : actionB) {
                actionB1.setEnabled(true);
            }
            actionB[2].setEnabled(false);
        }
        if(e.getSource() == actionB[3]){
            for (JButton actionB1 : actionB) {
                actionB1.setEnabled(true);
            }
            actionB[3].setEnabled(false);
        }
        
        if(e.getSource() == calcularB){
            double num1 = Double.parseDouble(num1TF.getText());
            double num2 = Double.parseDouble(num2TF.getText());
            switch(getButtonChoosen()){
                case "Suma":
                    resultL.setText(Double.toString(num1+num2));
                    break;
                case "Resta":
                    resultL.setText(Double.toString(num1-num2));
                    break;
                case "Multiplica":
                    resultL.setText(Double.toString(num1*num2));
                    break;
                case "Divide":
                    resultL.setText(Double.toString(num1/num2));
                    break;
                default:
                    resultL.setText("Error");
            }
            for (JButton actionB1 : actionB) {
                actionB1.setEnabled(true);
            }
        }
        
        if(e.getSource() == salirB){
            System.exit(0);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == num1TF){
            if(!num1TF.isEditable()){
                num1TF.setEditable(true);
                num1TF.setText("");
                num1TF.requestFocusInWindow();
            }
        }
        if(e.getSource() == num2TF){
            if(!num2TF.isEditable()){
                num2TF.setEditable(true);
                num2TF.setText("");
                num2TF.requestFocusInWindow();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    private String getButtonChoosen(){
        for (JButton actionB1 : actionB) {
            if (!actionB1.isEnabled()) {
                return actionB1.getText();
            }
        }
        return "";
    }

    public void getPanelSize(){
        System.out.println(this.getSize());
        System.out.println(panel.getSize());
    }
}
