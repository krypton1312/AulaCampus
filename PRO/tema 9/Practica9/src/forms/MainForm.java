package forms;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import objects.*;

public class MainForm extends JFrame implements ActionListener {
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
    ObjectContainer gearDataBase;
    ObjectContainer weaponDataBase;
    ObjectContainer grenadeDataBase;
    
    public MainForm(ObjectContainer gearDataBase, ObjectContainer weaponDataBase, ObjectContainer grenadeDataBase){
        this.gearDataBase = gearDataBase;
        this.weaponDataBase = weaponDataBase;
        this.grenadeDataBase = grenadeDataBase;
        this.setTitle("CS2 Equipment List");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1250, 500));
        this.add(panel);

        header = new String[]{"Name", "Type", "Price", "Damage", "Armor penetration", "Fire rate", "Magazine size", "Effect", "Armor value", "Has helmet", "Defuse time"};
        data = new Object[0][7];

        model = new DefaultTableModel(data, header);
        showWeapons(weaponDataBase);
        table = new JTable(model);
        table.setBackground(Color.WHITE);
        table.setGridColor(Color.BLACK);
        scroll = new JScrollPane(table);
        scroll.setBounds(10, 10, 1000, 480);
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

        String[] options = {"All", "Weapons", "Grenades", "Gear"};
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == selectTableCB){
            model.setRowCount(0);
            switch (selectTableCB.getSelectedIndex()) {
                case 0:
                    showWeapons(weaponDataBase);
                    showGrenades(grenadeDataBase);
                    showGear(gearDataBase);
                    break;
                case 1:
                    showWeapons(weaponDataBase);
                    break;
                case 2:
                    showGrenades(grenadeDataBase);
                    break;
                case 3: 
                    showGear(gearDataBase);
                    break;
            }
        }
    }
    
    private void showWeapons(ObjectContainer weaponDataBase) {
        ObjectSet weaponR = weaponDataBase.queryByExample(new Weapon(null, null, 0, 0, 0, 0, 0));
        while (weaponR.hasNext()) {
            Weapon weapon = (Weapon) weaponR.next();
            Object[] dataW = {
                weapon.getName(), weapon.getType(), weapon.getPrice(),
                weapon.getDamage(), weapon.getArmourPenetration(), weapon.getFireRate(),
                weapon.getMagazineSize(), "-", "-", "-", "-"
            };
            model.addRow(dataW);
        }
    }
    
    private void showGrenades(ObjectContainer grenadeDataBase){
        ObjectSet grenadeDataBaseR = grenadeDataBase.queryByExample(new Grenade(null, null, 0, null));
        while(grenadeDataBaseR.hasNext()){
            Grenade grenade = (Grenade) grenadeDataBaseR.next();
            Object[] dataG = {
                grenade.getName(), grenade.getType(), grenade.getPrice(), 
                "-", "-", "-", "-", grenade.getEffect(), "-", "-", "-", "-"};
            model.addRow(dataG);
        }
    }
    
    private void showGear(ObjectContainer gearDataBase){
        ObjectSet gearsResult = gearDataBase.queryByExample(new Gear(null, null, 0, 0, null, 0));
        while(gearsResult.hasNext()){
            Gear gear = (Gear) gearsResult.next();
            Object[] dataGear = {gear.getName(), gear.getType(), gear.getPrice(), "-", "-", "-", "-", "-", gear.getArmourValue(), gear.isHasHelmet(), gear.getDefuseTime()};
            model.addRow(dataGear);
        }
    }
}
