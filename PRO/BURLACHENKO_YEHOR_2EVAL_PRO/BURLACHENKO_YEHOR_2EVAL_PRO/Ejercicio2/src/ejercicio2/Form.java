package ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form extends JFrame implements ActionListener {

    JPanel panel;
    JLabel textL;
    JLabel resultL;
    JTextField markTF;
    JButton checkB;

    public Form() {
        this.setTitle("Ejercicio2");
        this.setResizable(false);
        this.setSize(250, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        this.add(panel);

        textL = new JLabel("Nota:");
        textL.setBounds(30, 30, 100, 30);
        panel.add(textL);

        markTF = new JTextField();
        markTF.setBounds(70, 30, 60, 30);
        panel.add(markTF);

        resultL = new JLabel();
        resultL.setBounds(140, 30, 90, 30);
        panel.add(resultL);

        checkB = new JButton("Comprobar");
        checkB.setFocusable(false);
        checkB.setBounds(30, 70, 150, 30);
        checkB.addActionListener(this);
        checkB.setBackground(Color.WHITE);
        panel.add(checkB);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkB) {
            if (Double.parseDouble(markTF.getText()) > 3.4) {
                resultL.setText("Aprobado.");
            }else{
                resultL.setText("Suspendido.");
            }
        }
    }
}
