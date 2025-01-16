package ejemplojtable;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class Formulario extends JFrame implements ActionListener {

    JPanel miPanel;

    DefaultTableModel modelo;
    JTable tabla;
    JScrollPane scroll;
    String[] cabecera;
    Object[][] datos;
    JButton clearB;
    JButton removeB;
    JButton addB;
    JTextField addDatosTF;
    public Formulario() {
        this.setTitle("Tabla de Empleados");
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        miPanel = new JPanel();
        miPanel.setLayout(null);

        cabecera = new String[]{"Nombre", "Apellidos", "Sueldo"};
        
        datos = new Object[0][3];
        
        modelo = new DefaultTableModel(datos, cabecera);
        
        modelo.addRow(new Object[]{"Luis", "Romero Sanz", 2122.12});
        modelo.addRow(new Object[]{"Pepe", "Santos", 3000.54});
        modelo.addRow(new Object[]{"Ryan", "Sanchis", 5000.99});
        
        tabla = new JTable(modelo);
        
        scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 10, 750, 200);
        miPanel.add(scroll);
        
        clearB = new JButton("Clear");
        clearB.setBounds(10, 300, 100, 30);
        clearB.addActionListener(this);
        miPanel.add(clearB);
        
        removeB = new JButton("Remove");
        removeB.setBounds(10, 340, 100, 30);
        removeB.addActionListener(this);
        miPanel.add(removeB);
        
        addB = new JButton("Add");
        addB.setBounds(300, 300, 100, 30);
        addB.addActionListener(this);
        miPanel.add(addB);
        
        addDatosTF = new JTextField("");
        addDatosTF.setBounds(410, 300, 200, 30);
        addDatosTF.addActionListener(this);
        miPanel.add(addDatosTF);
        
        this.add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearB){
            modelo.setRowCount(0);
        }
        
        if(e.getSource() == removeB){
            modelo.removeRow(tabla.getSelectedRow());
        }
        
        if(e.getSource() == addB){
            Object[] newDatos = (Object[]) addDatosTF.getText().split(",");
            modelo.addRow(newDatos);
        }
    }
}
