package practica7;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Form extends JFrame implements ActionListener {

    File dataFile = new File("data.txt");
    Vehiculo veh;
    JPanel panel;
    DefaultTableModel modelo;
    JTable tabla;
    JScrollPane scroll;
    String[] header;
    Object[][] data;
    JLabel tipT;
    JTextField inputDataTF;
    JButton getDataB;
    JButton delFirstB;
    JButton closeB;
    JButton updateB;

    public Form() throws IOException {
        this.setTitle("ITV");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1200, 500));
        this.add(panel);

        header = new String[]{"Matricula", "Marca", "Modelo", "Fecha Matriculacion", "Cilindrada", "Potencia", "Hora de llegada", "Tiempo en espera"};
        data = new Object[][]{};
        modelo = new DefaultTableModel(data, header);
        tabla = new JTable(modelo);
        tabla.setBackground(Color.WHITE);
        tabla.setGridColor(Color.BLACK);
        getDataFromFile();
        scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 10, 980, 300);
        scroll.getViewport().setBackground(Color.WHITE);
        panel.add(scroll);

        tipT = new JLabel("<html>Introduce datos.<br>Ejemplo: Matricula,Marca,Modelo,Fecha Matriculacion,Cilindrada,Potencia,Hora de llegada a la ITV<br>1234ABC,Toyota,Corolla,01/01/2020,1800,140</html>");
        tipT.setBounds(10, 320, 980, 60);
        tipT.setForeground(Color.WHITE);
        panel.add(tipT);

        inputDataTF = new JTextField("");
        inputDataTF.setBounds(10, 380, 980, 30);
        inputDataTF.setBackground(Color.WHITE);
        panel.add(inputDataTF);

        getDataB = new JButton("Añadir");
        getDataB.addActionListener(this);
        getDataB.setBounds(1000, 10, 190, 60);
        getDataB.setBackground(Color.WHITE);
        getDataB.setFocusable(false);
        panel.add(getDataB);

        delFirstB = new JButton("Eliminar");
        delFirstB.addActionListener(this);
        delFirstB.setBounds(1000, 80, 190, 60);
        delFirstB.setBackground(Color.WHITE);
        delFirstB.setFocusable(false);
        panel.add(delFirstB);

        updateB = new JButton("Actualizar");
        updateB.addActionListener(this);
        updateB.setBounds(1000, 150, 190, 60);
        updateB.setBackground(Color.WHITE);
        updateB.setFocusable(false);
        panel.add(updateB);

        closeB = new JButton("Cerrar");
        closeB.addActionListener(this);
        closeB.setBounds(1000, 220, 190, 60);
        closeB.setBackground(Color.WHITE);
        closeB.setFocusable(false);
        panel.add(closeB);

        this.pack();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getDataB) {
            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
            transformData(inputDataTF.getText() + "," + currentTime);
            try {
                setDataToFile();
            } catch (IOException ex) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == delFirstB) {
            if (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
                try {
                    updateFileData();
                } catch (IOException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (e.getSource() == updateB) {
            for (int i = 0; i < Vehiculo.vehiculos.size(); i++) {
                Vehiculo vehiculo = Vehiculo.vehiculos.get(i);
                modelo.setValueAt(vehiculo.calcularTiempoEspera(), i, 7);
            }
        }
        if (e.getSource() == closeB) {
            try {
                updateFileData();
            } catch (IOException ex) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }

    private void getDataFromFile() throws IOException {
        if (!dataFile.exists()) {
            dataFile.createNewFile();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(dataFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                transformData(linea);
            }
        }
    }

    private void setDataToFile() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dataFile, true))) {
            bw.write(inputDataTF.getText());
            bw.newLine();
            bw.flush();
        }
    }

    private void updateFileData() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dataFile))) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                StringBuilder linea = new StringBuilder();
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    linea.append(modelo.getValueAt(i, j));
                    if (j < modelo.getColumnCount() - 1) {
                        linea.append(",");
                    }
                }
                bw.write(linea.toString());
                bw.newLine();
            }
            bw.flush();
        }
    }

    private void transformData(String info) {
        String[] splitData = info.split(",");
        LocalDate fechaMatricula = LocalDate.parse(splitData[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime horaLlegada = LocalDateTime.parse(splitData[6], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        new Vehiculo(splitData[0], splitData[1], splitData[2], fechaMatricula, Double.parseDouble(splitData[4]), Double.parseDouble(splitData[5]), horaLlegada);
        modelo.addRow(splitData);
    }
}
