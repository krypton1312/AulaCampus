package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public MainForm() throws SQLException {
        this.setTitle("CS2 Equipment List");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs2_bd", "root","");
        stat = con.createStatement();
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(950,500));
        this.add(panel);
        
        header = new String[]{"Name", "Type", "Price", "Damage", "Armor penetration", "Fire rate", "Magazine size"};
        data = new Object[0][7];
        
        model = new DefaultTableModel(data, header);
        
        table = new JTable(model);
        table.setBackground(Color.WHITE);
        table.setGridColor(Color.BLACK);
        scroll = new JScrollPane(table);
        scroll.setBounds(10,10, 700, 480);
        scroll.getViewport().setBackground(Color.WHITE);
        panel.add(scroll);
        
        addB = new JButton("Add");
        addB.addActionListener(this);
        addB.setBounds(720, 10, 220, 40);
        addB.setBackground(Color.WHITE);
        addB.setFocusable(false);
        panel.add(addB);
        
        delB = new JButton("Delete");
        delB.addActionListener(this);
        delB.setBounds(720, 60, 220, 40);
        delB.setBackground(Color.WHITE);
        delB.setFocusable(false);
        panel.add(delB);
        
        String[] options = {"All", "Weapons", "Granades", "Gear"};
        selectTableCB = new JComboBox<>(options);
        selectTableCB.setBounds(720, 110, 220, 40);
        selectTableCB.setSelectedIndex(1);
        selectTableCB.setBackground(Color.WHITE);
        selectTableCB.setFocusable(false);
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
        }   
    }
    public void showWeapons() throws SQLException{
        ResultSet register = stat.executeQuery("SELECT * FROM weapons");
        if(register.next()){
            while(register.next()){
                String name = register.getString("name");
                String type = register.getString("type");
                int price = register.getInt("price");
                int damage = register.getInt("damage");
                double armor = register.getDouble("armor_penetration");
                double fire_rate = register.getDouble("fire_rate");
                int magazine = register.getInt("magazine_size");
                Object[] dataM = {name,type, price, damage, armor, fire_rate, magazine};
                model.addRow(dataM);
            }
        }
        con.close();
    }
}
