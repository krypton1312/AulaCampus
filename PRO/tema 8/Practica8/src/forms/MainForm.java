package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainForm extends JFrame implements ActionListener{
    JPanel panel;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    String[] header;
    Object[][] data;
    JButton addB;
    JButton delB;
    JComboBox<String> selectTableCB;
    JButton closeB;    
    Connection con;
    Statement stat;
    InputForm input = new InputForm();
    
    public MainForm() throws SQLException {
        this.setTitle("CS2 Equipment List");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs2_db", "root","");
        stat = con.createStatement();
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1250,500));
        this.add(panel);
        
        header = new String[]{"Name", "Type", "Price", "Damage", "Armor penetration", "Fire rate", "Magazine size", "Effect", "Armor value", "Has helmet", "Defuse time"};
        data = new Object[0][7];
        
        model = new DefaultTableModel(data, header);
        showWeapons();
        table = new JTable(model);
        table.setBackground(Color.WHITE);
        table.setGridColor(Color.BLACK);
        scroll = new JScrollPane(table);
        scroll.setBounds(10,10, 1000, 480);
        scroll.getViewport().setBackground(Color.WHITE);
        panel.add(scroll);
        
        addB = new JButton("Add");
        addB.addActionListener(this);
        addB.setBounds(1020, 10, 220, 40);
        addB.setBackground(Color.WHITE);
        addB.setFocusable(false);
        panel.add(addB);
        
        delB = new JButton("Delete");
        delB.addActionListener(this);
        delB.setBounds(1020, 60, 220, 40);
        delB.setBackground(Color.WHITE);
        delB.setFocusable(false);
        panel.add(delB);
        
        String[] options = {"All", "Weapons", "Granades", "Gear"};
        selectTableCB = new JComboBox<>(options);
        selectTableCB.setBounds(1020, 110, 220, 40);
        selectTableCB.setSelectedIndex(1);
        selectTableCB.setBackground(Color.WHITE);
        selectTableCB.setFocusable(false);
        selectTableCB.addActionListener(this);
        // Center text
        selectTableCB.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
        });
        panel.add(selectTableCB);
        
        closeB = new JButton("Close");
        closeB.addActionListener(this);
        closeB.setBounds(720, 160, 220, 40);
        closeB.setBackground(Color.WHITE);
        closeB.setFocusable(false);
        panel.add(closeB);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(closeB == e.getSource()){
            System.exit(0);
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(selectTableCB == e.getSource()){
            model.setRowCount(0);
            try {
                switch (selectTableCB.getSelectedIndex()) {
                    case 0 : showWeapons(); showGrenades(); showGear(); break;
                    case 1 : showWeapons(); break;
                    case 2 : showGrenades(); break;
                    case 3 : showGear(); break;
            }
            } catch (SQLException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, "Error", ex);
            }
        }
        if(delB == e.getSource()){
            try {
                delSelectedItem(table.getSelectedRow());
            } catch (SQLException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(addB == e.getSource()){
            input.setVisible(true);
        }
    }
    
    private void showWeapons() throws SQLException{
        ResultSet register = stat.executeQuery("SELECT * FROM weapons");
        if(register.next()){
            do{
                Object[] dataW = {register.getString("name"),register.getString("type"), register.getInt("price"), 
                    register.getInt("damage"), register.getDouble("armor_penetration"), register.getDouble("fire_rate"), register.getInt("magazine_size"), "-", "-", "-", "-"};
                model.addRow(dataW);
            }while(register.next());
        }
    }
    private void showGrenades() throws SQLException{
        ResultSet register = stat.executeQuery("SELECT * FROM grenades");
        if(register.next()){
            do{
                Object[] dataG ={register.getString("name"), "Granade", register.getString("price"), "-", "-", "-", "-", register.getString("effect"), "-", "-", "-", "-"};
                model.addRow(dataG);
            }while(register.next());
        }
    }
    private void showGear() throws SQLException{
        ResultSet register = stat.executeQuery("SELECT * FROM gear");
        if(register.next()){
            do{
                Object[] dataGear ={register.getString("name"), register.getString("type"), register.getString("price"), "-", "-", "-", "-", "-", "-", register.getString("armor_value"), register.getBoolean("has_helmet"), register.getInt("defuse_time")};
                model.addRow(dataGear);
            }while(register.next());
        }
    }
    private void delSelectedItem(int item) throws SQLException {
        String tableName = "";

        if (model.getValueAt(item, 3).equals("-") && model.getValueAt(item, 9).equals("-")) {
            tableName = "grenades";
        } else if (model.getValueAt(item, 8).equals("-") && model.getValueAt(item, 9).equals("-")) {
            tableName = "weapons";
        } else if (model.getValueAt(item, 3).equals("-") && model.getValueAt(item, 8).equals("-")) {
            tableName = "gear";
        }
        PreparedStatement delRow = con.prepareStatement("DELETE FROM " + tableName + " WHERE name LIKE ?");
        delRow.setString(1, (String) model.getValueAt(item, 0));
        delRow.executeUpdate();

        model.removeRow(item);
    }
}
