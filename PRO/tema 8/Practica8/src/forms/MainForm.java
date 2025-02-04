package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public MainForm() {
        this.setTitle("CS2 Equipment List");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
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
    public void actionPerformed(ActionEvent e) {}
}
